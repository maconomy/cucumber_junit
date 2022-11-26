package pages;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class mainpage {
	WebDriver webDriver;
	basepage basePage = new basepage(webDriver);
	
	@Then("I expect to see the menu")
	public void verifyMenuExists() {
		System.out.println("from mainpage verify menu exists");
	}
}
