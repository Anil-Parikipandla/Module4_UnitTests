package com.epam.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener implements IInvokedMethodListener{

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println(method.getTestMethod().getMethodName()+" - started execution.");
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println(method.getTestMethod().getMethodName()+" Result: "+(testResult.isSuccess()?"Pass":"Fail"));
	}
}


