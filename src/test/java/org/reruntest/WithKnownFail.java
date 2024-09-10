package org.reruntest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class WithKnownFail implements IRetryAnalyzer {
	int mincount = 0, maxcount = 5;

	@Override
	public boolean retry(ITestResult result) {

		if (mincount < maxcount) {
			mincount++;
			return true; // fail--> rerun till 4 times
		}
		return false; // pass
	}
}
