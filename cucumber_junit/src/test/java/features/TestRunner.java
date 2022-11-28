package features;

import java.time.LocalDateTime;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.testng.CucumberFeatureWrapper;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@ExtendedCucumberOptions(jsonReport = "target/cucumber-report.json", 
overviewReport = true, 
outputFolder = "${user.dir}/DATE(dd-MM-yyyy)", 
reportPrefix = "results-${user}",
jsonUsageReport = "target/cucumber-usage.json",
usageReport = true,
toPDF = true

)

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

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {

    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {

    }



    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {

    }
}
