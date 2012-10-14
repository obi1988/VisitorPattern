package com.visitor;
/**
 * Interfejs Visitor
 * @author obi1988
 *
 */
interface Visitor {
	
	void visit(Leaf l);
	void visit(Composite n);
}
