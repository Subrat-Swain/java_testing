package com.anvsystems.oopdemo3;

public class MailServer {
	
	private String serviceProvider;
	private String protocol;
	private String mailCapacity;
	private String mailLatency;
	
	public void setserviceProvider(String serviceProvider) {
		
		this.serviceProvider = serviceProvider;
	}
	public String getServiceProvider() {
		return this.serviceProvider;
	}
	public void setprotocol(String protocol) {
			this.protocol = protocol;
	}
	public String getprotocol(String protocol) {
		return this.protocol;
	}
	public void setmailCapacity(String mailCapaciy) {
			this.mailCapacity = mailCapacity;
	}
	public String getmailCapacity() {
		return this.mailCapacity;
	}
	public void setmailLatency(String mailLatency) {
		this.mailLatency = mailLatency;
	}
	public String getmailLatency() {
		return this.mailLatency;
	}
}
