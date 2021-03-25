package com.debjyoti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.debjyoti.Movable;
import com.debjyoti.MovableAdapter;
import com.debjyoti.movable.BugattiVeyron;
import com.debjyoti.movableadapter.MovableAdapterImpl;

public class MovableAdapterImplTest {

	@Test
	public void whenCovertingMPHtoKMPH_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);

		// adapter converts 268 mph to 431 km/h
	}

	@Test
	public void whenCovertingUSDtoEuro_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

		assertEquals(bugattiVeyronAdapter.getPrice(), 164000.00, 0.00001);

		// adapter converts 268 mph to 431 km/h
	}

}
