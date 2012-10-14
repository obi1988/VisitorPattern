package com.visitor;

public class PrintVisitor implements Visitor {

	public void visit(Leaf l) {
		System.out.println("-" + l.getName());
	}

	public void visit(Composite n) {
		System.out.println("+" + n.getName());
		for (Component c : n.components) {
			System.out.print("  ");
			if (!(n.getChild(1) != null)) {
				System.out.print("  ");
			}
			c.accept(this);
		}
	}
}