package wdMethods;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends SeMethods {
@Before
	public void beforeMethod() {
	startResult();
	startTestModule("CreateLead", "Verify Create Lead");	
	test = startTestCase("Node1");
	test.assignCategory("Sanity");
	test.assignAuthor("Sekhar");
	startApp("Chrome");	
}
@After
public  void afterMethod() {
	closeAllBrowsers();
	endResult();
	
}
}
