package com.pplm.study.design.pattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NodeB extends Node {
	
	private static final Logger logger = LoggerFactory.getLogger(NodeB.class);
			
	public NodeB() {
		super("node b");
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void bOperation(String visitorName) {
		logger.info(visitorName + " visits " + nodeName + " bOperation function");
	}
	
}
