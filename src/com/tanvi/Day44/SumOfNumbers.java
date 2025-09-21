package com.tanvi.Day44;

import java.util.*;
public class SumOfNumbers {
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        return Sum(n-1)+n;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(Sum(n));
    }
}
