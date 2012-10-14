package com.visitor;

import com.visitor.Composite;
import com.visitor.Leaf;
/**
 * Główna klasa aplikacji, 
 * @author Michał Obiała
 *
 */
public class Main {
	public static void main(String[] args) {

		
		Leaf leafBaseOne = new Leaf("Wydruki");
		Leaf leafBaseTwo = new Leaf("Informacje");
		Leaf leafOne = new Leaf("Lista Oczekujących");
		Leaf leafTwo = new Leaf("Moje");
		Leaf leafBaseAOne = new Leaf("Zmień hasło");
		Composite nodeA = new Composite("Administracja");
		nodeA.add(leafBaseAOne);
		Composite base = new Composite("Menu Główne");
		Composite baseA = new Composite("Aktywności");
		Composite baseS = new Composite("Sprawy");
		
		base.add(leafBaseOne);
		base.add(leafBaseTwo);
		base.add(nodeA);
		baseA.add(leafOne);
		baseA.add(leafTwo);
		baseS.add(leafOne);
		baseS.add(leafTwo);

		base.accept(new PrintVisitor());
		baseA.accept(new PrintVisitor());
		baseS.accept(new PrintVisitor());
	}

}