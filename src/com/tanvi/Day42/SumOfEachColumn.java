package com.tanvi.Day42;

import java.util.*;
public class SumOfEachColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=0;j<n;j++){
                sum = sum + arr[j][i];
            }
            System.out.println(sum);
        }
    }
}
