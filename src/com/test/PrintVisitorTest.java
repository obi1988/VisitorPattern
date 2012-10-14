package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.visitor.Component;
import com.visitor.Composite;
import com.visitor.Leaf;
import com.visitor.PrintVisitor;

public class PrintVisitorTest {

	@Test
	public void testVisitLeaf() {
		Leaf leaf = new Leaf("name");
		String result = "-name";
		assertEquals(result, "-"+leaf.getName());
	}

	@Test
	public void testVisitComposite() {
		Composite composite = new Composite("name");
		String result = "+name";
		assertEquals(result, "+"+composite.getName());		
		
	}

}
