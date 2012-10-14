package com.visitor;

public interface Component {
	public String getName();

	public void add(Component c);

	public Component getChild(int i);

	void accept(Visitor v);
}