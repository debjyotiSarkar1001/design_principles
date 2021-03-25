package com.debjyoti.messagesubsribers;

import com.debjyoti.interfaces.Observer;
import com.debjyoti.model.Message;

public class MessageSubscriberTwo implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
	}

}
