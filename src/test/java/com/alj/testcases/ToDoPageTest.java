package com.alj.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.alj.base.TestBase;
import com.alj.pages.ToDoPage;

public class ToDoPageTest extends TestBase {

	// ToDoPage todopage();

	public ToDoPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException {
		browserinitialization();
		ToDoPage todopage = new ToDoPage();

	}
	
	@Test
	public void CapexApp() {
		
	}
	
	

	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
