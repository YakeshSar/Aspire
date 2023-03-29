package com.steps;

import java.util.Date;

import com.Objects.Basepage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Basepage{

	@Before
	public void before() {
		Date date = new Date();
		System.out.println(date.toGMTString());
	}
	
	@Before
	public void start() {
		System.out.println("start the execution");
	}
	
	@After
	public void after() {
		Date date = new Date();
		System.out.println(date.toGMTString());
		driver.close();
	}
	

	@After
	public void end() {
		System.out.println("End the execution");
	}
}
