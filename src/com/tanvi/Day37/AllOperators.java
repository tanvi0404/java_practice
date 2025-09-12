package com.tanvi.Day37;

public class AllOperators {
    public static void main(String[] args) {

        // -------- Assignment Operators --------
        int a = 10;
        int b = 5;

        a += 3;
        b -= 2;
        a *= 2;
        b /= 3;
        a %= 4;

        // -------- Relational Operators --------
        boolean r1 = (a == b);
        boolean r2 = (a != b);
        boolean r3 = (a > b);
        boolean r4 = (a < b);
        boolean r5 = (a >= b);
        boolean r6 = (a <= b);

        // -------- Logical Operators --------
        boolean x = true;
        boolean y = false;

        boolean l1 = (x && y);
        boolean l2 = (x || y);
        boolean l3 = !x;

        // -------- Ternary Operator --------
        int num1 = 20, num2 = 15;
        String result = (num1 > num2) ? "num1 is greater" : "num2 is greater or equal";

        // -------- Output Results --------
        System.out.println("Assignment Results: a = " + a + ", b = " + b);
        System.out.println("Relational Results: " + r1 + ", " + r2 + ", " + r3 + ", " + r4 + ", " + r5 + ", " + r6);
        System.out.println("Logical Results: " + l1 + ", " + l2 + ", " + l3);
        System.out.println("Ternary Result: " + result);
    }
}

