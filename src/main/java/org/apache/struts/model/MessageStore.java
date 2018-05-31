package org.apache.struts.model;

public class MessageStore {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageStore() {
		message = "Hello word!";
	}

	public String toString() {
		return message + " (from toString)";
	}
}
