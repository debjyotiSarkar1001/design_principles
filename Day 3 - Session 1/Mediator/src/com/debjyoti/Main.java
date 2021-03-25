package com.debjyoti;

import com.debjyoti.chatmediator.ChatMediator;
import com.debjyoti.interfaces.IChatMediator;
import com.debjyoti.interfaces.IUser;
import com.debjyoti.user.BasicUser;
import com.debjyoti.user.PremiumUser;

public class Main {

	public static void main(String[] args) {
		IChatMediator chatMediator = new ChatMediator();
		IUser user1 = new BasicUser(chatMediator, "ABC");
		chatMediator.AddUser(new BasicUser(chatMediator, "PQR"));
		chatMediator.AddUser(new PremiumUser(chatMediator, "XYZ"));
		chatMediator.AddUser(new PremiumUser(chatMediator, "RST"));
		chatMediator.AddUser(new BasicUser(chatMediator, "HJK"));
		
		user1.sendMessage("Hello Everyone");
	}
	
}	
