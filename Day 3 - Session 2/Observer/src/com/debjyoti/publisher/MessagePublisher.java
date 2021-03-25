package com.debjyoti.publisher;

import java.util.ArrayList;
import java.util.List;

import com.debjyoti.concrete.ConcreteSubject;
import com.debjyoti.interfaces.Observer;
import com.debjyoti.interfaces.Subject;
import com.debjyoti.model.Message;

public class MessagePublisher extends ConcreteSubject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
		System.out.println();
	}

}
