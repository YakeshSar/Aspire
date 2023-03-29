package com.steps;

import java.util.Date;

import com.Objects.Basepage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Basepage{

	@Before
	public void before() {
		Date date = new Date();
		long time = date.getTime();
		System.out.println(time);
	}
	
	
	@After
	public void after() {
		driver.close();
	}
}
