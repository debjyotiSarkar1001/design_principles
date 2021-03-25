package com.debjyoti.concrete;

import com.debjyoti.State;
import com.debjyoti.interfaces.Subject;
import com.debjyoti.model.Message;

public abstract class ConcreteSubject implements Subject {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		notifyUpdate(new Message("State Changed"));
	}

}
