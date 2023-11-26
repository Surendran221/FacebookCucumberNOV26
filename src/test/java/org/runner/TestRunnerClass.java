package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.test.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.StepDefinition",dryRun=false,
snippets=SnippetType.CAMELCASE,plugin= {"html:target\\Report",
		"junit:target\\Report\\face.xml",
		"json:target\\Report\\login.json",
		"rerun:src\\test\\resources\\ReRun\\failed.txt"})
public class TestRunnerClass  extends JVMReport{
@AfterClass
public static void smartskill() {
	generateJvmReport(System.getProperty("user.dir")+"\\target\\Report\\login.json");	  
}
}
                       

