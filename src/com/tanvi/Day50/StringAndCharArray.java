package com.tanvi.Day50;

public class StringAndCharArray {
    public static void main(String[] args) {
        String str = "Tanvi";
        char str2[] = {'T','A','N','V','I'};
        str2[0] = 'B';
        for(int i=0;i<5;i++){
            System.out.print(str2[i]);
        }
        System.out.println();
        System.out.println(str);
    }
}
