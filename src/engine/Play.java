package engine;

import xml_parser.*;

public class Play {

	public static void main(String[] args) {
		String path = System.getProperty("java.class.path") + "//..//games//small_house.xml";
		XML_Parser a = new XML_Parser(path);
		System.out.println(a.readToString());
	}

}
