package com.pplm.study.design.pattern.visitor;

public class Demo {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.addNode(new NodeA());
		objectStructure.addNode(new NodeB());
		objectStructure.action(new VisitorA());
		objectStructure.action(new VisitorB());
	}

}
