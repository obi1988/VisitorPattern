package com.visitor;
/**
 * Klasa implementująca interfejs Visitor
 * Wyświetla obiekty
 * 
 * @author Michał Obiała
 *
 */
public class PrintVisitor implements Visitor {

	/**
	 * Wyświetlanie nazwy obiektu typu Leaf
	 */
	public void visit(Leaf leaf) {
		System.out.println("-" + leaf.getName());
	}

	/**
	 * Wyświetlanie nazwy obiektu typu Composite
	 */
	public void visit(Composite composite) {
		System.out.println("+" + composite.getName());
		for (Component c : composite.components) {
			System.out.print("  ");
			if (!(composite.getChild(1) != null)) {
				System.out.print("  ");
			}
			c.accept(this);
		}
	}
}