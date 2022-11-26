package tests;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;

import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class basetest {
	@Given(value = "I want to open browser")
	@Before
	public void Before() {
		WebDriver webDriver = null;
		System.out.println("========beforetest========");
		
		LocalDateTime DT = LocalDateTime.now();
		System.setProperty("cucumber.plugin=", "json:target/cucumber" + DT + ".json");
		System.out.println("beforecucumberplugin");
		
		}
		
	
	@Then(value = "Close browser")
	@After
	public void After() {
		System.out.println("after test: close browser");

	}
}
