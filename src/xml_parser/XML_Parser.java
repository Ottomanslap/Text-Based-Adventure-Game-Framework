package xml_parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class XML_Parser {
	
	private static FileReader reader;
	
	public static void Parse(String path) throws FileNotFoundException{
		
		FileReader reader = new FileReader(path);
		
		
		
	}
	
	private static String read() throws IOException{
		
		return String.valueOf(reader.read());
		
	}
	
	private Node getNextNode() throws IOException{
		
		String nextChar = read();
		
		while (nextChar != "<"){
			nextChar = read();
		}
		
		if (nextChar.equals("!") || nextChar.equals("?")){
			while (nextChar != ">"){
				nextChar = read();
			}
			return null;
		}
		else {
			String type = "";
			while (nextChar != " " && nextChar != ">"){
				nextChar = read();
				type += nextChar;
			}
			type.substring(0, type.length()-2);
			
			
		}
			
		
	}

}
