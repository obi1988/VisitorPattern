package com.visitor;

interface Visitor {
	void visit(Leaf l);

	void visit(Composite n);
}
