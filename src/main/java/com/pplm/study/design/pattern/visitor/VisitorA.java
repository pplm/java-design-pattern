package com.pplm.study.design.pattern.visitor;

public class VisitorA extends Visitor {

	public VisitorA() {
		super("visitor A");
	}

	@Override
	public void visit(NodeA aNode) {
		aNode.operation(super.visitorName);
	}

	@Override
	public void visit(NodeB bNode) {
		bNode.operation(super.visitorName);
	}

}
