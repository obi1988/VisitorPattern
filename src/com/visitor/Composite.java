package com.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa implementująca interfejs Component, odpowiedzialna za reprezentację
 * "węzła"
 * 
 * @author Michał Obiała
 * 
 */
public class Composite implements Component {
	private String name;
	public List<Component> components = new ArrayList<Component>();

	public Composite(String name) {
		this.name = name;
	}

	/**
	 * Pobranie obiektu podrzędnego
	 * 
	 * @param i
	 * @return Component
	 */
	public Component getChild(int i) {
		Component strReturn;
		strReturn = components.size() - 1 < i ? null : components.get(i);
		return strReturn;
	}

	/**
	 * Pobranie nazwy obiektu
	 * 
	 * @return String
	 */

	public String getName() {
		return name;
	}

	/**
	 * Dodanie obiektu typu Component
	 * 
	 * @param state
	 */
	public void add(Component state) {
		components.add(state);
	}

	/**
	 * Specjalna metoda wywołująca metodę visit interfejsu Visitor
	 * 
	 */
	public void accept(Visitor v) {
		v.visit(this);
	}
}
