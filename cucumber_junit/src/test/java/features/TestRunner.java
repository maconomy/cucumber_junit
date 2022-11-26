package features;

import java.time.LocalDateTime;

import org.junit.runner.RunWith;


import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/features/f.feature"},
		glue= {"pages","tests"},
		monochrome = true
		,plugin = {"pretty","json:target/cucumber.json","html:target/cucumber-reports/report.html" }
		
		
		)

public class TestRunner{

	/*
	 * public LocalDateTime DT = LocalDateTime.now();
	 * 
	 * @BeforeTest
	 * 
	 * @Before public void beforeCucumberPlugin() {
	 * System.setProperty("cucumber.plugin", "json:target/cucumber" + DT + ".json");
	 * System.out.println("beforecucumberplugin"); }
	 */
}
