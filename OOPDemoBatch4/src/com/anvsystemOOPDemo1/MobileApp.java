package com.anvsystemOOPDemo1;

public class MobileApp extends Application{
	
	int reqRam;
	boolean interNetAccess;
	
	
	void postPhoto() {
		if(interNetAccess) {
			System.out.println("Your Photo is Posted in "+this.name);
		}else {
			System.out.println("!Can't Post Your Photo.Please Check Your Internet Connection");
		}
	}
	void postComment() {
		if(interNetAccess) {
			System.out.println("Your Comment is Posted in "+this.name);
		}else {
			System.out.println("!Can't Post Your Comment.Please Check Your Internet Connection");
		}
	}
	public static void main(String[] args) {
		MobileApp m = new MobileApp();
		m.name = "facebook";
		m.type = "MobileApp";
		m.interNetAccess = true;
		m.logIn();
		m.postPhoto();
		m.postComment();
		m.logOut();
	}
}
