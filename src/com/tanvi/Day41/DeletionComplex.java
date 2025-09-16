package com.tanvi.Day41;

import java.util.Scanner;

public class DeletionComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int value= sc.nextInt();
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=value){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
