package com.anvsystems.oopdemo3;

public class Server {
	/**
	 * Exted this class to 
	 * EdgeComputing commented 
	 * code part to run commented code in Server Class
	 */
//	public String serviceProvider;
//	protected String ram;
//	private String processor;
//	
//	public Server(String serviceProvider, String ram, String processor){
//		this.serviceProvider = serviceProvider;
//		this.ram = ram;
//		this.processor = processor;
//	}
////	public static void main(String[] args) {
////		Server s = new Server();
////		s.processor = "abcd";
////	}
//	
//	private void displayServerInfo() {
//		System.out.println("############### SERVER INFO ###############");
//		System.out.println(this.processor);
//		System.out.println(this.ram);
//		System.out.println(this.serviceProvider);
//	}
	
	
	private String serviceProvider;
	private String machineType;
	private String ram;
	private String processor;
	
	public void setServiceProvider(String serviceProvider) {
		if(serviceProvider.contains("amazon")) {
			this.serviceProvider = serviceProvider;
		}
	}
	public String getServiceProvider() {
		return this.serviceProvider;
	}
}

