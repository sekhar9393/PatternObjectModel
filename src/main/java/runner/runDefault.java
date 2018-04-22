package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/feature",glue= {"wdMethods","pages"},tags= {"@Smoke,@Sanity"})
public class runDefault {

}
