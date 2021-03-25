package com.debjyoti.leaverequesthandler;

import com.debjyoti.ILeaveRequestHandler;
import com.debjyoti.LeaveRequest;

public class HR implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler;
	
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.leaveDays <= 10) {
			System.out.println("Request Approved by HR");
		}
		else {
			System.out.println("Rejected by HR");
		}
	}

}
