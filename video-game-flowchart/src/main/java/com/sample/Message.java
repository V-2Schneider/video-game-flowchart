package com.sample;

import java.util.ArrayList;

public class Message {
	public static final int CHANGED = 1;
	public static final int ADRESSED = 0;
	
	private String message;
	private int status;
	
	public Message(String message) {
		this.message = message;
		this.status = Message.CHANGED;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
