package com.pack;

public class Leaf implements Component{
	 private String name;
	 
	 public Leaf(String name){
	  this.name = name;
	 }
	 
		 public String getName() {
		  return name;
		 }

		
		public Component getChild(int i) {
			return null;
		}
		 public void accept(Visitor v) {
			    v.visit(this);
			  }

		@Override
		public void add(Component c) {
			// TODO Auto-generated method stub
			
		}
		 
		}