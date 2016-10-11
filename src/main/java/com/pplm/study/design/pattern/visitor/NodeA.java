package com.pplm.study.design.pattern.visitor;

public class NodeA extends Node {

	public NodeA() {
		super("node a");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
