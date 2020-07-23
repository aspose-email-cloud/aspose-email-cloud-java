package com.aspose.email.cloud.sdk.api.utils;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestNameLogger extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) {
        log(tr, "- FAILED -");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        log(tr, "/ skipped /");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        log(tr, "+ SUCCESS +");
    }

    private void log(ITestResult tr, String result) {
        String suiteName = tr.getTestClass().getRealClass().getSimpleName();
        System.out.println(suiteName + "." + tr.getName() + ": " + result);
    }

}