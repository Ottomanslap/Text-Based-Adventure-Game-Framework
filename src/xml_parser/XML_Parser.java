package xml_parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class XML_Parser {

	private FileReader reader;
	private String data;
	private String trimmed;
	private Node head;
	
	
	
	public XML_Parser(String path) throws FileNotFoundException{
		setReader(new FileReader(path));
		setData(readToString().trim());
		generateHead(path);
		trimmed = trimExcess(data);
		
		
	}

	private String trimExcess(String file) {
		
		int next = file.indexOf("<");
		
		if (file.indexOf("<") == -1){
			return file.trim();
		}else if (file.charAt(next + 1) == '?' || file.charAt(next + 1) == '!'){
			String pre = file.substring(0, next);
			file = file.substring(next);
			file = file.substring(file.indexOf(">") + 1);
			return pre.trim() + trimExcess(file.substring(file.indexOf(">") + 1)).trim();
		}else{
			String pre = file.substring(0, next + 1);
			file = file.substring(next + 1);
			pre += file.substring(0, file.indexOf("<") + 1);
			return pre.trim() + trimExcess(file.substring(file.indexOf("<") + 1)).trim();
		}
	}

	public FileReader getReader() {
		return reader;
	}

	public void setReader(FileReader reader) {
		this.reader = reader;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public Node getHead(){
		return head;
	}
	
	public String getTrimmed(){
		return trimmed;
	}

	private char read() {

		try {
			return (char) reader.read();
		} catch (IOException e) {
			return (char) -1;
		}

	}

	private String readToString(){
		char nextChar;
		String str = "";
		nextChar = read();
		while (nextChar != (char) -1){
			str += nextChar;
			nextChar = read();
		}
		return str;
	}
	
	private void generateHead(String path){
		String name = path.substring(path.lastIndexOf((int) '/') + 1, path.lastIndexOf((int) '.'));
		head = new Node(name);
	}

}
