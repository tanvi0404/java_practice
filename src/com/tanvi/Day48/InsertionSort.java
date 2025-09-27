package com.tanvi.Day48;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i=1;i<n;i++){
            int key = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
