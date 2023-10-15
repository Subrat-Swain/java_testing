package com.qna;

public class WebApp {
	
	// internet access
	// data source
	// static assets : image or any library
	
	public String dbUsername;
	public String dbPassword;
	public String dbServiceName;
	public String internetStaticAddress;
	
	public WebApp(String filePath) {
		System.out.println("initialized new Flat File "+filePath);
	}
	
	public WebApp(String username, String password, String serviceName, String ipAddress) {
		// database connetion
		// internet
		// Static assets
		this.dbUsername = username;
		this.dbPassword = password;
		this.dbServiceName = serviceName;
		this.internetStaticAddress = ipAddress;
		connectToDB();
	}
	
	public void connectToDB() {
		System.out.println("Database Connected");
	}
	
	public void connectToDb(String username, String password, String clientType, String service) {
		System.out.println("Connected To Database service "+service);
	}
	public static void main(String[] args) {
		WebApp myApp = new WebApp("data.txt");
//		WebApp gmail = new WebApp("user", "pwd", "awsDynamodb", "127.0.0.1");
	}
}
