package org.StepDefinition;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.BaseClass;
import org.test.LogPojo;

import io.cucumber.java.en.*;

public class LoginStepDefinition extends BaseClass{
	@Given("user should launch the chrome browser and load the url")
	public void user_should_launch_the_chrome_browser_and_load_the_url() throws AWTException {
	   launchchrome();
	   loadurl("https://www.facebook.com");
	   winMax();
	}

	@When("user should input invalid username and invalid password")
	public void user_should_input_invalid_username_and_invalid_password() {
	    LogPojo l = new LogPojo();
	    WebElement txtuser = l.getTxtuser();
	    WebElement txtpass = l.getTxtpass();
	    fill(txtuser, "aravind");
	    fill(txtpass, "arav78hjj3");
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		LogPojo l = new LogPojo();
		WebElement btnlogin = l.getBtnlogin();
		btnclick(btnlogin);
		stawait(2000);
	}
	@When("user should print current url of my page")
	public void userShouldPrintCurrentUrlOfMyPage() {
	    printcurrenturl();
	}


	@Then("user should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
	  String url = driver.getCurrentUrl();
	   Assert.assertTrue("check the credentials", url.contains("token"));
	   System.out.println("passed");
	  // closechrome();
	}
	@When("user should print the title of page")
	public void user_should_print_the_title_of_page() {
	   printTitle();
	}
	@When("user should input valid username and invalid password")
	public void userShouldInputValidUsernameAndInvalidPassword() {
		 LogPojo l = new LogPojo();
		    WebElement txtuser = l.getTxtuser();
		    WebElement txtpass = l.getTxtpass();
		    fill(txtuser, "arunkumar");
		    fill(txtpass, "arun890()");
	}
	@When("user should input invalid username {string}and valid password{string}")
	public void userShouldInputInvalidUsernameAndValidPassword(String s1, String s2) {
		 LogPojo l = new LogPojo();
		    WebElement txtuser = l.getTxtuser();
		    WebElement txtpass = l.getTxtpass();
		    fill(txtuser, s1);
		    fill(txtpass, s2);
	}
	@Given("user should launch chrome and load url")
	public void userShouldLaunchChromeAndLoadUrl() throws AWTException {
	    launchchrome();
	    loadurl("https://www.facebook.com");
	    winMax();
	}

	@When("user should click forgotten button link")
	public void userShouldClickForgottenButtonLink() throws InterruptedException {
	   driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	   Thread.sleep(2000);
	}

	@When("user should input invalid mobile number")
	public void userShouldInputInvalidMobileNumber() {
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("654675467676");
	}

	@When("user should click the search button")
	public void userShouldClickTheSearchButton() {
		driver.findElement(By.xpath("//button[@id='did_submit']")).click();
	}

	@Then("user should navigate to recover page")
	public void userShouldNavigateToRecoverPage() {
	   String currentUrl = driver.getCurrentUrl();
	   Assert.assertTrue("chk the cond", currentUrl.contains("recover"));
	   //closechrome();
	}

	@When("user should input valid username and invaliD password")
	public void userShouldInputValidUsernameAndInvaliDPassword(io.cucumber.datatable.DataTable d) {
	   List<Map<String, String>> a = d.asMaps();
	   Map<String, String> x = a.get(2);
	   String s1 = x.get("kit");
	   Map<String, String> y = a.get(1);
	   String s2 = y.get("person");
	   LogPojo l = new LogPojo();
	    WebElement txtuser = l.getTxtuser();
	    WebElement txtpass = l.getTxtpass();
	    fill(txtuser, s1);
	    fill(txtpass, s2);
	   
	}


}
