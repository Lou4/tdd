package com.jay;

import com.utils.MyStringUtilsTest;
import com.utils.MyArrayUtilsTest;

public aspect Logging {
	
	pointcut loggingTestExecution(): execution(void MyStringUtilsTest.test*())
					|| execution(void MyArrayUtilsTest.test*());
	
	after() : loggingTestExecution(){
		System.out.println(thisJoinPoint.getSignature().getName() + ":  test eseguito");
	}
}
