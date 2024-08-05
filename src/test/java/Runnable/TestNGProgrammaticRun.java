package Runnable;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import utility.ScreenRecorderUtil;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestNGProgrammaticRun {

    public static void main(String[] args) throws Exception {
    	
    	ScreenRecorderUtil.startRecord("main");
        // Create an instance of TestNG
        TestNG testNG = new TestNG();

        // Create a list to hold XmlSuite objects
        List<XmlSuite> suites = new ArrayList<>();

        // Add the first suite
        XmlSuite suite1 = new XmlSuite();
        suite1.setName("Suite1");
        suite1.setSuiteFiles(List.of("C:\\Users\\wbox62\\eclipse-workspace\\SSIAgroworlds2\\testng.xml"));

        suites.add(suite1);

//        // Add the second suite
//        XmlSuite suite2 = new XmlSuite();
//        suite2.setName("Suite2");
//        suite2.setSuiteFiles(List.of("C:\\Users\\wbox62\\eclipse-workspace\\SSIAgroworlds\\BDMtestng.xml"));
//
//        suites.add(suite2);

        // Set the list of suites to the TestNG instance
        testNG.setXmlSuites(suites);

        // Run the TestNG suite
        testNG.run();
        
        ScreenRecorderUtil.stopRecord();
    }
}
