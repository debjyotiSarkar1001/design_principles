package com.debjyoti.item;

import com.debjyoti.interfaces.Item;
import com.debjyoti.interfaces.Packing;
import com.debjyoti.packing.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
