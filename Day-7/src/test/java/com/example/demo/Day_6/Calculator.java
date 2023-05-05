package com.example.demo.Day_6;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Calculator {
	calculatort2 g=new calculatort2();
	@Test
	public void addition() {
		int c=g.add(5, 2);
		Assert.assertEquals(c, 7);
	}

}
