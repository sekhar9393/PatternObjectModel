package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/feature/Myntra.feature",glue= {"wdMethods","myntra"})
public class RunMyntra {

}
