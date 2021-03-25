package com.debjyoti.chatmediator;

import java.util.ArrayList;
import java.util.List;

import com.debjyoti.interfaces.IChatMediator;
import com.debjyoti.interfaces.IUser;

public class ChatMediator implements IChatMediator{

	private List<IUser> users;
	
	public ChatMediator() {
		 users = new ArrayList<>();
	}
	
	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message) {
		for (IUser user: users) {
			user.recieveMessage(message);
		}
	}

}
