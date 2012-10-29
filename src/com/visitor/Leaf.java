package com.visitor;
/**
 * Klasa implementująca interfejs Komponent, odpowiedzialna za reprezentację "liścia"
 * @author Michał Obiała
 *
 */
public class Leaf implements Component {
	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void add(Component state) {
		//lisc nie moze miec potomka
		
	}

}