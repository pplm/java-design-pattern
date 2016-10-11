package com.pplm.study.design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public final class ObjectStructure {
	private List<Node> nodeList = new ArrayList<>();

	public ObjectStructure() {
		super();
	}
	
	public void action(Visitor visitor) {
		nodeList.forEach(node -> node.accept(visitor));
	}
	
	public void addNode(Node node) {
		nodeList.add(node);
	}
	
}
