package engine;

import java.io.FileNotFoundException;

import xml_parser.*;

public class Play {

	public static void main(String[] args) {
		String path = System.getProperty("java.class.path") + "//..//games//small_house.xml";
		XML_Parser a;
		try {
			a = new XML_Parser(path);
			System.out.println(a.getData());
			System.out.println(a.getHead().getType());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
