package org.test;
import org.testng.Assert;
import  org.testng.annotations.Test;


public class TestngRerun {
@Test
private void tc1() {
	System.out.println("Test 1");
}

@Test
private void tc2() {
	Assert.assertTrue(false);
	System.out.println("Test 2");
}
	@Test
	private void tc3() {
		System.out.println("Test 3");
	}
}
