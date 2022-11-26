package pages;

import org.openqa.selenium.WebDriver;

public class basepage {
	public WebDriver webDriver;
	
	
	public basepage(WebDriver driver) {
		this.webDriver = driver;
	}
	
	public void click() {
		System.out.println("from basepage click method");
	}
}
