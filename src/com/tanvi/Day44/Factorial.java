package com.tanvi.Day44;

import java.util.Scanner;
public class Factorial {
    static int Fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return Fact(n-1)*n;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(Fact(n));
    }
}
