package org.test;
import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class RunSuite {
	@Test
	public void tc1() {
		Result result = JUnitCore.runClasses(JunitOrder.class);
		System.out.println("Runcount:"+result.getRunCount());
		System.out.println("FailureCount:"+result.getFailureCount());
		System.out.println("Ignorecount:"+result.getIgnoreCount());
		System.out.println("Runtime:"+result.getRunTime());
		List<Failure> failures = result.getFailures();
		for (Failure failure : failures) {
			System.out.println("Failures:"+failure);
			
		}

	}

}
