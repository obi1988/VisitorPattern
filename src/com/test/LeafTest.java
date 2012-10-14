package com.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.visitor.Leaf;

public class LeafTest {

	@Test
	public void testGetName() {
		Leaf comp = new Leaf("test");
		String result = comp.getName();
		assertEquals("test", result);
	}

	@Test
	public void testAccept() {
	}

}
