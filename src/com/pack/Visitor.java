package com.pack;

interface Visitor {
	  void visit(Leaf l);
	  void visit(Composite n);
	}
