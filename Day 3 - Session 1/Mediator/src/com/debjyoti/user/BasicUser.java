package com.debjyoti.user;

import com.debjyoti.interfaces.IChatMediator;
import com.debjyoti.interfaces.IUser;

public class BasicUser implements IUser {

	private IChatMediator chatmediator;
	private String name;
	
	public BasicUser(IChatMediator chatmediator, String name) {
		this.chatmediator = chatmediator;
		this.name = name;
	}
	
	@Override
	public void recieveMessage(String message) {
		System.out.println("User Name : " + name + ", message : " + message);
	}

	@Override
	public void sendMessage(String message) {
		chatmediator.sendMessage(message);
	}

}
