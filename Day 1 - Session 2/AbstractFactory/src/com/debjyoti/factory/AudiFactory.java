package com.debjyoti.factory;

import com.debjyoti.abstractclass.Factory;
import com.debjyoti.abstractclass.Headlight;
import com.debjyoti.abstractclass.Tire;
import com.debjyoti.audi.AudiHeadlight;
import com.debjyoti.audi.AudiTire;

public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}
