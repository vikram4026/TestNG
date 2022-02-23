package com.dayseventh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		annotation.getRetryAnalyzer();
		annotation.setRetryAnalyzer(Failed.class);
		
		
		
		
	}

	
	
	
	
}
