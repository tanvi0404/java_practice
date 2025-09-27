package com.tanvi.Day48;

import java.util.Scanner;
    public class BinaryWithSorting {
        public static int BinaryWithSortingg(int[] arr,int left, int right, int target){
            if(left>right){
                return -1;
            }
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return BinaryWithSortingg(arr,left,mid-1,target);
            }
            else{
                return BinaryWithSortingg(arr,mid+1,right,target);
            }
        }

        public static void main(String[] args) {
            System.out.println("Enter the Size of the array: ");
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the element to be searched: ");
            int target = sc.nextInt();
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-1-i;j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            int result = BinaryWithSortingg(arr,0,arr.length-1,target);
            if(result==-1){
                System.out.println("Element not found");
            }
            else{
                System.out.println("Found at index : " + result);
            }
        }
    }


