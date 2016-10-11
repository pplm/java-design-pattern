package com.pplm.study.design.pattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VisitorB extends Visitor {

	private static final Logger logger = LoggerFactory.getLogger(VisitorB.class);
	
	public VisitorB() {
		super("visitor b");
	}

	@Override
	public void visit(NodeA aNode) {
		logger.info("visitor b only visits node b");
	}

	@Override
	public void visit(NodeB bNode) {
		bNode.bOperation(super.visitorName);
	}

}
