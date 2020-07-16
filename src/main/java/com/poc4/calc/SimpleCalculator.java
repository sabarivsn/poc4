package com.poc4.calc;

public class SimpleCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("divider cannot be zero");
        }

        return a / b;
    }
}
