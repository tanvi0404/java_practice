package com.tanvi.Day45;

import java.util.*;
public class SumOfDiagonal {
    public static void main(String[] args) {
        int n,i,j,m,sum=0;
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        if(m!=n){
            System.out.println("Not Possible");
            return;
        }
        int[][] arr = new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    sum = sum+arr[i][j];
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}

// CAN USE deepToString
