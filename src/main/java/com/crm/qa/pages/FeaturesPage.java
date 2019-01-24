package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class FeaturesPage extends TestBase {
	
	@FindBy(xpath="//*[text()=\"CRM Dashboard\"]")
	WebElement CRMDashboardLink;
	
	// Initializing the Page Objects:
	public FeaturesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyFeaturesPageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCRMDashboardLink() {
		
		Actions a = new Actions(driver);
		a.moveToElement(CRMDashboardLink).click().build().perform();
		return true;
	}

}
