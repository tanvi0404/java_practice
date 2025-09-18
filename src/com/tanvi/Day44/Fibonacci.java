package com.tanvi.Day44;

import java.util.*;
public class Fibonacci {
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.print(fib(i)+ " ");
        }
    }
}
