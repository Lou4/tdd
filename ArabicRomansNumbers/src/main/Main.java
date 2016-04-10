package main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.ConversionTest;

public class Main {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ConversionTest.class);
		for(Failure failure: result.getFailures()){
			System.out.println(failure.toString());
		}
		
		System.out.println("Run count: " + result.getRunCount());
		System.out.println("Run time: " + result.getRunTime());
	}
}
