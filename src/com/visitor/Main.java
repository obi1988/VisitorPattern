package com.visitor;

import com.visitor.Component;
import com.visitor.Composite;
import com.visitor.Leaf;
/**
 * Główna klasa aplikacji, 
 * @author obi1988
 *
 */
public class Main {
	public static void main(String[] args) {

		
		Component leafBaseOne = new Leaf("Wydruki");
		Component leafBaseTwo = new Leaf("Informacje");
		Component leafOne = new Leaf("Lista Oczekujących");
		Component leafTwo = new Leaf("Moje");
		Component leafBaseAOne = new Leaf("Zmień hasło");
		Component nodeA = new Composite("Administracja");
		nodeA.add(leafBaseAOne);
		Component base = new Composite("Menu Główne");
		Component baseA = new Composite("Aktywności");
		Component baseS = new Composite("Sprawy");
		
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