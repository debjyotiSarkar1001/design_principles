package com.debjyoti;

import com.debjyoti.messagesubsribers.MessageSubscriberOne;
import com.debjyoti.messagesubsribers.MessageSubscriberThree;
import com.debjyoti.messagesubsribers.MessageSubscriberTwo;
import com.debjyoti.model.Message;
import com.debjyoti.publisher.MessagePublisher;

public class Main {

	public static void main(String[] args) {

		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();
		
		MessagePublisher p = new MessagePublisher();
		
		p.attach(s1);
		p.attach(s2);
		
		p.notifyUpdate(new Message("First Message"));
		
		p.detach(s1);
		p.attach(s3);
		
		p.notifyUpdate(new Message("Second Message"));
		
		p.setState(new State());

//		Output
		
//		MessageSubscriberOne :: First Message
//		MessageSubscriberThree :: First Message
//
//		MessageSubscriberThree :: Second Message
//		MessageSubscriberTwo :: Second Message
//
//		MessageSubscriberThree :: State Changed
//		MessageSubscriberTwo :: State Changed		
		
	}

}
