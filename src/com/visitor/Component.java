package com.visitor;
/**
 * Interfejs Component
 * @author Michał Obiała
 *
 */
public interface Component {
	/**
	 * metoda pozwala pobrać nazwę obiektu
	 * @return String
	 */
	public String getName();
	public void add(Component state);
	void accept(Visitor v);
}