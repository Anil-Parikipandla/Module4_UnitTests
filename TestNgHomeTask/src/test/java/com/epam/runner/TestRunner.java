package com.epam.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import com.epam.listeners.CustomListener;

public class TestRunner {
	public static void main(String args[])
	{
		TestListenerAdapter testadapter = new TestListenerAdapter();
		TestNG objTestNg= new TestNG();
		XmlSuite tstSuite = new XmlSuite();
		objTestNg.addListener(testadapter);
		objTestNg.addListener(new CustomListener());
		tstSuite.setName("CustomRunnerSuite");

		List<String> files = new ArrayList<String>();
		files.add("./src/test/resources/calculatorTests.xml");

		tstSuite.setSuiteFiles(files);

		List<XmlSuite> testSuites = new ArrayList<XmlSuite>();
		testSuites.add(tstSuite);

		objTestNg.setXmlSuites(testSuites);
		objTestNg.run();


	}
}
