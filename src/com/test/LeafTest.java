package com.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.visitor.Leaf;

public class LeafTest {

	@Test
	public void testGetName() {
		Leaf leaf = new Leaf("test");
		String result = leaf.getName();
		assertEquals("test", result);
	}

	@Test
	public void testAccept() {
	}

}
