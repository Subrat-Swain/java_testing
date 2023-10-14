package com.anvsystems.oopdemo3;

public class Gmail extends MailServer {
	
	private String mailContent;
	private String fromAddress;
	private String toAddress;
	
	// Setter & Getter Methods:-
	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}
	public String getMailContent() {
		return this.mailContent;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public String getFromAddress() {
		return this.fromAddress;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	public String getToAddress() {
		return this.toAddress;
	}
	public void sendMail(String fromAddress, String toAddress, String mailContent) {
		this.setFromAddress(fromAddress);
		System.out.println("Email sent from "+this.fromAddress+" to "+toAddress);
	}
	
	public static void main(String[] args) {
		Gmail gmail = new Gmail();
		gmail.setserviceProvider("Google");
//		System.out.println(gmail.getServiceProvider());
//		gmail.setFromAddress("subrat.com");
//		gmail.setToAddress("com.subrat");
		gmail.sendMail("subrat.com", "com.subrat", "hy this is my message");
		System.out.println(gmail.getToAddress());
	}
}
