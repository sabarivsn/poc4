package com.poc4.sample;

import com.poc1.sample.Employee;
import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class Runner {
    public static void main(String[] args) {

        Thread runnerThread = new Thread(new Runner().new TestRunnable());
        runnerThread.run();
    }

    private class TestRunnable implements Runnable {
        public void run() {
            TestListenerAdapter adapter = new TestListenerAdapter();
            TestNG testng = new TestNG();
            testng.setTestClasses(new Class[] {CucumberTestRunner.class});
            testng.addListener((ITestNGListener)adapter);
            testng.run();
        }
    }
}
