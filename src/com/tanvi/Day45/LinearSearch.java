package com.tanvi.Day45;

import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int n, key;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        key = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                System.out.println("Found at Index " + i);
            }
        }
    }
}
