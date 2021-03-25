package com.debjyoti.messagesubsribers;

import com.debjyoti.interfaces.Observer;
import com.debjyoti.model.Message;

public class MessageSubscriberThree implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
		
	}

}
