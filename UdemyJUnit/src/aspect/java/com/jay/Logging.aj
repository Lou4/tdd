package com.jay;

import com.utils.MyStringUtils;
import com.utils.MyStringUtilsTest;
import com.utils.MyArrayUtilsTest;
import com.utils.MyStringUtilsParametrizedTest;

public aspect Logging {
	
	pointcut loggingTestExecution(): execution(void MyStringUtilsTest.test*())
					|| execution(void MyArrayUtilsTest.test*());
	
	after() : loggingTestExecution(){
		System.out.println(thisJoinPoint.getSignature().getName() + ":  test eseguito");
	}
	
	
	/* - - - */
	
	pointcut logClassVariableInitialization(): call(MyStringUtils.new(..)) &&
									within(MyStringUtilsParametrizedTest);
	
	before(): logClassVariableInitialization(){
		System.out.println("--A-Initialize MyStringUtils");
	}
}
