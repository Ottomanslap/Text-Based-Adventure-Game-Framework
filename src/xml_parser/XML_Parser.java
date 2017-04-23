package xml_parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class XML_Parser {

	private FileReader reader;
	private String data;
	private Node head;

	public XML_Parser(String path) throws FileNotFoundException{
		setReader(new FileReader(path));
		setData(readToString().trim());
		generateHead(path);
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
			System.out.print(nextChar);
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
