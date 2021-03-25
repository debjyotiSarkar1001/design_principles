package com.debjyoti.interfaces;

import com.debjyoti.model.Message;

public interface Subject {

	void attach(Observer o);
	void detach(Observer o);
	void notifyUpdate(Message m);
	
}
