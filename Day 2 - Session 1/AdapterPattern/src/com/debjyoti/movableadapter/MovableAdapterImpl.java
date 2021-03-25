package com.debjyoti.movableadapter;

import com.debjyoti.Movable;
import com.debjyoti.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;

	public MovableAdapterImpl(Movable luxuryCars) {
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	@Override
	public double getPrice() {
		return convertUSDtoEuro(luxuryCars.getPrice());
	}

	private double convertUSDtoEuro(double price) {
		return 0.82 * price;
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

}
