package com.tutorials.testNG2.TeamCityTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser launched");
	}
	
	@BeforeMethod
	public void openURL() {
		System.out.println("Requested URL has been opened");
	}
	
	
	@BeforeTest
	public void BeforeTestMethod() {
		System.out.println("This will run before every @test annotation method");
	}
	
	@Test
	public void SayHello() {
		System.out.println("Hello to Test NG");
	}

	
	
	@Test
	public void highestPriority() {
		System.out.println("Test with priority 1");
	}

}
