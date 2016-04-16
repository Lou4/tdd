package com.jay;

import com.utils.MyStringUtilsTest;

public aspect Logging {
	
	pointcut loggingTestExecution(): execution(void MyStringUtilsTest.test*());
	
	after() : loggingTestExecution(){
		System.out.println(thisJoinPoint.getSignature().getName() + ":  test eseguito");
	}
}
