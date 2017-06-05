package com.epam.calculatorTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class FailedTests {

	private Calculator calculate;

	//Multiplication method is not giving the exact results for double input values
	@Test
	public void productOfDouble()
	{
		double actualResult = calculate.mult(253.68,7.8);
		Assert.assertEquals(actualResult,1978.704, "This is a BUG!!!!!!!!!");
	}

	//Pow method in Calculator is not giving exact results for double input values
	@Test
	public void powerOfDouble()
	{
		double actualResult = calculate.pow(6.23,5.36);
		Assert.assertEquals(actualResult,Math.pow(6.23,5.36), "This is a BUG!!!!!!!!!");
	}

	//divison method is not throwing NumberFormatException for double input parameters i.e., zero.
	@Test(expectedExceptions = NumberFormatException.class)
	public void divideByZero()
	{
		calculate.div(23.5,0);

	}

	//cos method is not giving the exact results
	@Test
	public void cosineOfDouble()
	{
		double actualResult = calculate.cos(6.23);
		Assert.assertEquals(actualResult,Math.cos(6.23), "This is a BUG!!!!!!!!!");
	}

	//ctg method is not giving the exact results
	@Test
	public void cotangentofDouble()
	{
		double actualResult = calculate.ctg(0.23);
		Assert.assertEquals(actualResult,1/Math.tan(0.23), "This is a BUG!!!!!!!!!");
	}

	//tg methos is not giving the exact results
	@Test
	public void tangentofDouble()
	{
		double actualResult = calculate.tg(6.23);
		Assert.assertEquals(actualResult,Math.tan(6.23), "This is a BUG!!!!!!!!!");
	}

}
