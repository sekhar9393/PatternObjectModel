package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/feature/EditLead.feature",glue= {"wdMethods","pages"})
public class RunEditLead {

}
