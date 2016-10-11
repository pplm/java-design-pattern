package com.pplm.study.design.pattern.visitor;

public abstract class Visitor {
	
	protected String visitorName;
		
	public Visitor(String visitorName) {
		super();
		this.visitorName = visitorName;
	}

	public abstract void visit(NodeA aNode);
	public abstract void visit(NodeB bNode);

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}
	
}
