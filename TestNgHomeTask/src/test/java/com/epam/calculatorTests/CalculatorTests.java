package com.epam.calculatorTests;

import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.epam.dataProviders.DataProviders;
import com.epam.tat.module4.Calculator;

public class CalculatorTests extends DataProviders {
	private Calculator calculate;

	@BeforeSuite
	public void printSuiteName(ITestContext suite){
		System.out.println("Suite Name: "+ suite.getSuite().getName());
	}

	@BeforeClass(alwaysRun = true)
	public void getCalculator() {
		calculate = new Calculator();
		System.out.println("Before Class, Calculator object is created!");
	}

	@BeforeTest
	public void printTestName(ITestContext test){
		System.out.println("Test Name: "+test.getName());
	}

	@BeforeMethod
	public void printMethodName(Method method ){
		System.out.println("Method Name: "+ method.getName());
	}

	@Test(groups = {"PositiveTests", "AlgebraTests"}, dataProvider = "sumOfDouble")
	public void sumOfDouble(double firstNumber, double SecondNumber, double expectedResult){
		double actualResult = calculate.sum(firstNumber, SecondNumber);
		System.out.println("sum is: "+actualResult);
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test(groups = {"PositiveTests", "AlgebraTests","failed"}, dataProvider = "multiplicationOfDouble")
	public void multiplicationOfDouble(double firstNumber, double SecondNumber, double expectedResult){
		double actualResult = calculate.mult(firstNumber, SecondNumber);
		System.out.println("Product is: "+actualResult);
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test(groups = {"PositiveTests", "AlgebraTests","failed"}, dataProvider = "divisionOfLong")
	public void divisionOfLong(long firstNumber, long secondNumber, long expectedResult){
		long actualResult = calculate.div(firstNumber, secondNumber);
		System.out.println("Quotient is: "+actualResult);
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test(groups = {"PositiveTests", "TrigonometricTests","failed"}, dataProvider = "cotangentOfDouble")
	public void cotangetOfdouble(double inputValue, double expectedResult){
		double actualResult = calculate.ctg(inputValue);
		System.out.println("Co-tanget of "+actualResult+" is: "+ actualResult);
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test(groups = {"PositiveTests", "AlgebraTests"}, dataProvider = "squarerootOfDouble")
	public void squarerootOfDouble(double inputValue, double expectedResult){
		double actualResult = calculate.sqrt(inputValue);
		System.out.println("Square-root of "+inputValue+" is: "+actualResult);
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test(groups = {"NegativeTests", "AlgebraTests"}, dataProvider = "differenceOfDouble")
	public void differenceOfDouble(double firstNumber, double secondNumber, double expectedResult){
		double actualResult = calculate.sub(firstNumber, secondNumber);
		System.out.println("difference is: "+actualResult);
		Assert.assertNotEquals(actualResult, expectedResult);
	}


	@Test(groups = {"NegativeTests", "AlgebraTests", "failed"}, dataProvider = "powerOfDouble")
	public void powerOfDouble(double baseNumber, double exponentNumber, double expectedResult){
		double actualResult = calculate.pow(baseNumber, exponentNumber);
		System.out.println("Actual Result is: "+actualResult);
		Assert.assertNotEquals(actualResult, expectedResult);
	}

	@Test(groups = {"NegativeTests", "TrigonometricTests", "failed"}, dataProvider = "cosineOfDouble")
	public void cosineOfDouble(double inputValue, double expectedResult){
		double actualResult = calculate.cos(inputValue);
		System.out.println("Actual Result is: "+actualResult);
		Assert.assertNotEquals(actualResult, expectedResult);
	}


	@Test(groups = {"NegativeTests", "AlgebraTests"}, dataProvider = "isPositiveNumber")
	public void isPositiveNumber(long inputValue, boolean expectedResult){
		boolean actualResult = calculate.isPositive(inputValue);
		System.out.println("Actual Result is: "+actualResult);
		Assert.assertNotEquals(actualResult, expectedResult);
	}

	@Test(groups = {"NegativeTests", "TrigonometricTests", "failed"}, dataProvider = "tangentOfDouble")
	public void tangentOfDouble(double inputValue, double expectedResult){
		double actualResult = calculate.tg(inputValue);
		System.out.println("Actual Result is: "+actualResult);
		Assert.assertNotEquals(actualResult, expectedResult);
	}

	@Test(groups = {"optionalTests"})
	public void isNegative(){
		boolean actualResult = calculate.isNegative(-48796L);
		System.out.println("Actual Result is: "+actualResult);
		Assert.assertEquals(actualResult, true);
	}

	@AfterMethod
	public void printMethodStatus(ITestResult testResult,Method method)
	{
		System.out.println("Test :"+method.getName()+" , Result :"+testResult.isSuccess());
	}

	@AfterTest
	public void printSuccessTests(ITestContext test){
		System.out.println("Test Name: "+test.getName()+"Success Tests are: "+test.getFailedTests());
	}

	@AfterClass
	public void printAfterClass(){
		System.out.println("After Class");
	}

	@AfterSuite
	public void printSuiteNameAfterSuite(ITestContext suite){
		System.out.println("After Test Suite : "+suite.getSuite().getName());
	}




}
