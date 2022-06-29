package com.projectcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;
	public Search_Hotel(WebDriver driver1) {
		this.driver=driver1;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(xpath="//*[@id=\"room_type\"]")
	private WebElement roomtype;
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(id="continue")
	private WebElement press;
	
	
	public WebElement getPress() {
		return press;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}

	@FindBy(id="room_nos")
	private WebElement rooms;
	@FindBy(id="datepick_in")
	private WebElement checkin;
	@FindBy(id="datepick_out")
	private WebElement checkout;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement submit;
	
	
	
	
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	
	
	
	

	public WebElement getRooms() {
		return rooms;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getLocation() {
		return location;
	}
	public WebElement getRadio() {
		return radio;
	}
	
	

}
