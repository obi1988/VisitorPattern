package com.visitor;
/**
 * Interfejs Visitor
 * @author Michał Obiała
 *
 */
interface Visitor {
	
	void visit(Leaf l);
	void visit(Composite n);
}
