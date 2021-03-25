package com.debjyoti.item;

import com.debjyoti.interfaces.Item;
import com.debjyoti.interfaces.Packing;
import com.debjyoti.packing.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
}
