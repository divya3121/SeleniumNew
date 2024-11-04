package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/Feature/GoogleSearch.feature"},glue={"StepDef"},plugin={"pretty","html:target/target.html"})

public class searchtest extends AbstractTestNGCucumberTests{

}
