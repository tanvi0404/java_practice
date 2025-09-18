package com.tanvi.Day44;

import java.util.*;
public class DiagonalProduct {
    public static void main(String[] args) {
        int n,i,j,m,prod=1;
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
                    prod = prod*arr[i][j];
                }
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    arr[i][j] = prod;
                }
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

// CAN USE deepToString
