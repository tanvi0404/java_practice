package com.tanvi.Day42;

import java.util.*;
public class LargestElementInARow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int max = arr[i][0];
            for(int j=0;j<n;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
