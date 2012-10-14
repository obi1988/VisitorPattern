package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.visitor.Component;
import com.visitor.Composite;
public class CompositeTest {
	List<Component> components = new ArrayList<Component>();
	@Test
	public void testGetChild() {
		Composite main = new Composite("main");
		Composite subMain = new Composite("subMain");
		components.add(subMain);
		main.add(subMain);
		Component result = main.getChild(0);
		assertEquals(components.get(0), result);
	}

	@Test
	public void testGetName() {
		Composite comp = new Composite("test");
		String result = comp.getName();
		assertEquals("test", result);
	}

	@Test
	public void testAdd() {
		Composite base = new Composite("main");
		components.add(base);
		Component result = components.get(0);
		assertEquals(base, result);
	}

	@Test
	public void testAccept() {
		
	}

}
