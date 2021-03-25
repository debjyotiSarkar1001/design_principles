package com.debjyoti.messagesubsribers;

import com.debjyoti.interfaces.Observer;
import com.debjyoti.model.Message;

public class MessageSubscriberOne implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

}
