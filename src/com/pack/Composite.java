package com.pack;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private String name;
	List<Component> components = new ArrayList<Component>();

	public Composite(String name) {
		this.name = name;
	}

	public Component getChild(int i) {
		/*		if (i > components.size() - 1) {
			return null;
		}
	*/	
		Component strReturn;
		strReturn = components.size()-1 < i ? null : components.get(i);		
		return strReturn;
	}

	public String getName() {
		return name;
	}

	public void add(Component state) {
		components.add(state);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
}
