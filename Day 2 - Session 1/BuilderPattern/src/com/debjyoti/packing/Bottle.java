package com.debjyoti.packing;

import com.debjyoti.interfaces.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
