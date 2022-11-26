package pages;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class loginpage {
	WebDriver webDriver;
	basepage basePage = new basepage(webDriver);

	public void fromBasepage() {
		basePage.click();
	}

	@When(value = "I login")
	public void login() {
		System.out.println("set username");
		System.out.println("set password");
		System.out.println("click login");

	}

	//params
	@When(value = "^I set username (.*) and password (.*)$")
	public void login(String username, String password) {
		System.out.println("set " + username + " and " + password + " manually");
	}
}
