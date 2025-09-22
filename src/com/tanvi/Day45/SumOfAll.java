package com.tanvi.Day45;

import java.util.*;
public class SumOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0,n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}
