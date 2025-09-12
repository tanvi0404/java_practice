package com.tanvi.Day40;

import java.util.*;
public class SquarePattern {
    public static void main(String[] args) {
        int a,i,j;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(i=1;i<=a;i++){
            for(j=1;j<=a;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
