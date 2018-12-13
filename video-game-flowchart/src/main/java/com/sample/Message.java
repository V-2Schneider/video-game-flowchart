package com.sample;

import java.util.ArrayList;

public class Message {
	public String result = "";
	public ArrayList<String> questions;
	
	public Message(ArrayList<String> questions) {
		this.questions = new ArrayList<>();
		this.questions = questions;
	}
	
	public void SetResult(String res) {
		this.result = res;
	}
}
