package com.anvsystems.oopdemo3;

public class EdgeComputing{
	/**
	 * extend the EdgeComputing 
	 * From Server's commented c
	 * ode to run the commented part code
	 */
//	String serverNearestLocation;
//	
//	public EdgeComputing() {
//		super("AWS", "8GB", "Intel XEON");
//	}
//	public static void main(String[] args) {
//		EdgeComputing e = new EdgeComputing();
//		e.displayServerInfo();
//	}
	public static void main(String[] args) {
		Server awsServer = new Server();
		awsServer.setServiceProvider("Google");
		System.out.println(awsServer.getServiceProvider());
	}
}
