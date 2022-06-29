package com.projectcucumber;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {
public static WebDriver driver;


public Pageobjectmanager(WebDriver driver2) {
	this.driver=driver2;
}


public Loginpage getLoginpage() {
	Loginpage l = new Loginpage(driver);
	return l ;
	
}


public Search_Hotel getsearch_hotel() {
	
	Search_Hotel s = new Search_Hotel(driver);
	
	return s;
}

public Book_Hotels getBook_hotels() {
	Book_Hotels b = new Book_Hotels(driver);
	return b ;
}


	
}


	


