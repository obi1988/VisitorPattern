package com.visitor;

public class Leaf implements Component {
	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Component getChild(int i) {
		return null;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void add(Component c) {
	}

}