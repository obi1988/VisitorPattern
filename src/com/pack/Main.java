package com.pack;

public class Main {
	public static void main(String[] args) {
		  Component leaf = new Leaf("Wydruki");
		  Component leaf2 = new Leaf("Informacje");
		  Component leaf3 = new Leaf("Lista Oczekujących");
		  Component leaf4 = new Leaf("Moje");
		  Component leaf5 = new Leaf("Zmień hasło");
		  Component comp = new Composite("Administracja");
		  comp.add(leaf5);
		  Component base = new Composite("Menu Główne");
		  Component base2 = new Composite("Aktywności");
		  Component base3 = new Composite("Sprawy");
		  
		  base.add(leaf);
		  base.add(leaf2);
		  base.add(comp);
		  base2.add(leaf3);
		  base2.add(leaf4);
		  base3.add(leaf3);
		  base3.add(leaf4);
		  base2.add(leaf5);
		  
		  
		  base.accept(new PrintVisitor());
		  base2.accept(new PrintVisitor());
		  base3.accept(new PrintVisitor());
		 }
		
}