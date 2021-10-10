package org.example.sandbox.exception;

public class Calculator {

    public int divide(int a, int b){
        int returnValue = 0;
        try {
            returnValue = a / b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }

    public float divide (float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.divide(2,0));
        System.out.println(calc.divide(2.0f, 2.0f));
    }
}
