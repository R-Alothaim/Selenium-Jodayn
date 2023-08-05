package com.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
  
  @Override
  public void onTestStart(ITestResult result) {
    System.out.println("Test Started!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  }
  @Override
  public void onTestSuccess(ITestResult result) {
    System.out.println("Test Success");
  }
  @Override
  public void onTestFailure(ITestResult result) {
    System.out.println("Test Failed");
  }
  @Override
  public void onTestSkipped(ITestResult result) {
    System.out.println("Test Skipped");
  }
  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    System.out.println("Test Failed but within success percentage");
  }
  @Override
  public void onStart(ITestContext context) {
    System.out.println("Test Started");
  }
  @Override
  public void onFinish(ITestContext context) {
    System.out.println("Test Finished!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  }
  
}
