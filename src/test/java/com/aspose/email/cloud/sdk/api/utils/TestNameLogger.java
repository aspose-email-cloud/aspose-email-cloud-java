package com.aspose.email.cloud.sdk.api.utils;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestNameLogger extends TestListenerAdapter{
    @Override
    public void onTestFailure(ITestResult tr) {
        log(tr.getName()+ ": - FAILED -");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        log(tr.getName()+ ": / skipped /");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        log(tr.getName()+ ": + SUCCESS +");
    }

    private void log(String string) {
        System.out.println(string);
    }

}