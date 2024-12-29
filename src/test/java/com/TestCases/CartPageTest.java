package com.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartPageTest extends BaseClass
{
	@BeforeClass
	public void pageSetup()
	{
		System.out.println("pageSetup");
		ip=hp.doLogin("jyoti20","test123");
		ip.addProductToCart("Phones","Samsung galaxy s7");
		cp=ip.launchCartPage();
		
	}

	
  @Test(priority=1)
  public void getProductDetails()
  {
	  System.out.println("currenly in getProductDetails");
	  cp.getProductDetails();
  }

  @Test(priority=2)
  public void validateOrder()
  {
	  System.out.println("currenly in validateOrder");
	  cp.placeOrder("jyoti","India","Pune","card123","Dec","2025");
  }
}