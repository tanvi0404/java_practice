package com.tanvi.Day41;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int value = sc.nextInt();
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
        n++;
        System.out.println(Arrays.toString(arr));
    }
}
