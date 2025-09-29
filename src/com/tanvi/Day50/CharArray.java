package com.tanvi.Day50;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = new char[n];
        for(int i=0;i<n;i++){
            str[i] = sc.next().charAt(0);
        }
        for(int i=0;i<n;i++){
            System.out.print(str[i]);
        }
    }
}
