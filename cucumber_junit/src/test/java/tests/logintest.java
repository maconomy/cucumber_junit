package tests;



import org.junit.Test;

import pages.loginpage;


public class logintest {

	@Test
	public void test1() {
		loginpage loginPage = new loginpage();
		loginPage.fromBasepage();
		
	}
	
	
}
