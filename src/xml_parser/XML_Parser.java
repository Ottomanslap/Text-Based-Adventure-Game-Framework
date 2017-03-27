package xml_parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class XML_Parser {

	private FileReader reader;
	private String data;

	public XML_Parser(String path){
		try {
			setReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			System.out.println("XML_Parser: Exeption: The specified file could not be found.");
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

	private char read() {

		try {
			return (char) reader.read();
		} catch (IOException e) {
			return (char) -1;
		}

	}

	public String readToString(){
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

}
