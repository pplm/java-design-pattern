package com.pplm.study.design.pattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Node {

	private static Logger logger = LoggerFactory.getLogger(Node.class);
	
	protected String nodeName;
	
	public Node(String nodeName) {
		super();
		this.nodeName = nodeName;
	}
	
	public abstract void accept(Visitor visitor);

	public void operation(String visitorName) {
		logger.info(visitorName + " visits " + nodeName + " operation function");
	}
	
}
