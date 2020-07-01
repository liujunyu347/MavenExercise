package com.flexon.exercise;

public class Calculator {
    public Integer sum(Integer x, Integer y){
        if (x == null || y == null)
            return null;

        return x + y;

    }

    public double minus(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        if (b == 0){
            System.out.println("divisor can not be 0");
            return 0;
        }else{
            return a / b;
        }

    }
}
