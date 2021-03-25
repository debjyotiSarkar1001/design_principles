package com.debjyoti.concrete;

import com.debjyoti.State;
import com.debjyoti.interfaces.Observer;
import com.debjyoti.interfaces.Subject;

public abstract class ConcreteObserver implements Observer {

	private State observerState;

	public ConcreteObserver(Subject subject) {
		
	}

}
