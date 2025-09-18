package com.tanvi.Day43;

import java.util.*;

public class Cache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Cache Size: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the cache elements:");
        String[] cache = new String[n+1];
        for (int i = 0; i < n; i++) {
            cache[i] = sc.nextLine();
        }
        System.out.println("Enter the element to be added: ");
        String NewElement = sc.nextLine();
        cache[n] = NewElement;
        System.out.println("Cache after rotation:");
        for (int i = n; i >= 1; i--) {
            System.out.println(cache[i]);
        }

    }
}

