package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecuteMaven {

//My Test Cases then Change in GIT
	
	@Test
	public void Sum(){
		int a = 10 ;
		int b = 20 ;
		Assert.assertEquals(30, a+b);
		System.out.println("Sum Method");
		
	}
	
	@Test
	public void Summmmmmm(){
		int a = 10 ;
		int b = 20 ;
		Assert.assertEquals(30, a+b);
		System.out.println("Sum Method");
		
	}
	
	@Test
	public void Sub(){
		int a = 20 ;
		int b = 10 ;
		Assert.assertEquals(10, a-b);
		System.out.println("Sub Method");
	}

    @Test
	public void Sub2(){
		int a = 20 ;
		int b = 10 ;
		Assert.assertEquals(10, a-b);
		System.out.println("Sub----2 Method");
	}


	@Test
	public void Sub3(){
		int a = 20 ;
		int b = 10 ;
		Assert.assertEquals(10, a-b);
		System.out.println("Sub----3 Method");
	}
	

}
