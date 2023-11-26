package org.StepDefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.test.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
@Before(order=1)
public void configchrome() throws AWTException {
	   System.out.println("hooks before executed");
	   launchchrome();
	   loadurl("https://www.facebook.com");
	   winMax();       

}
@Before(order=2)
public void startdate() {
	System.out.println(new Date());
}
@After(order=3)
public void aftereachscenario(Scenario s) throws IOException {
	if (s.isFailed()) {
	TakesScreenshot tk=(TakesScreenshot)driver;
	byte[] scr = tk.getScreenshotAs(OutputType.BYTES);
	s.embed(scr, "image/png");
	}
	closechrome();
	System.out.println("hooks after executed");
}
@After(order=1)
public void enddate() {
	System.out.println(new Date());

}
}
