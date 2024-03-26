package com.nopCommerce1.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopCommerce1.PageObjects.LoginPage;
public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User provided"); //logger msg
		lp.setPassword(password);
		logger.info("Password provided");//logger msg
		lp.clickLogin();
		logger.info("Login in Clicked");//logger msg

		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			
			Thread.sleep(5000);
			lp.clickLogout();
			Assert.assertTrue(true);
			logger.info("Login Passed");//logger msg
		} else {
			Assert.assertTrue(false);
			logger.info("Login Failed");//logger msg
		}

	}


}
