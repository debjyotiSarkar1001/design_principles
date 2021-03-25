package com.debjyoti.factory;

import com.debjyoti.abstractclass.Factory;
import com.debjyoti.abstractclass.Headlight;
import com.debjyoti.abstractclass.Tire;
import com.debjyoti.mercedes.MercedesHeadight;
import com.debjyoti.mercedes.MercedesTire;

public class MercedesFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
