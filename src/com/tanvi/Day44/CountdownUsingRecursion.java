package com.tanvi.Day44;

import java.util.Scanner;
public class CountdownUsingRecursion {
    static void countdown(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countdown(n);
    }
}