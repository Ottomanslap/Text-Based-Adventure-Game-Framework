package xml_parser;

import java.util.ArrayList;

public class Node {
	
	private String type;
	private ArrayList<Attribute> attributes = new ArrayList<Attribute>();
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
	Node(String type, ArrayList<Attribute> attributes, ArrayList<Node> nodes){
		this.setType(type);
		this.setAttributes(attributes);
		this.setNodes(nodes);
	}
	
	Node(String type, Attribute[] attributes, Node[] nodes){
		this.setType(type);
		for (Attribute attribute : attributes){
			this.addAttribute(attribute);
		}
		for (Node node : nodes){
			this.addNode(node);
		}
	}

	public ArrayList<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
	}
	
	public void addAttribute(Attribute attribute){
		attributes.add(attribute);
	}

	public ArrayList<Node> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	
	public void addNode(Node node){
		nodes.add(node);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
