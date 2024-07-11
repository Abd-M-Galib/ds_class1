package com.example;

public class Main {
    public static void main(String[] args) {
        int arr[] = {34,45,756,34,456,8,453,64,623,457,345};
        int biggest = 0;
        int lowest = arr[0];

        for(int i = 0; i< arr.length; i++){
            if (arr[i] > biggest) biggest = arr[i];
            if (arr[i] < lowest) lowest = arr[i];
        }

        System.out.println("The biggest number of the array is  = "+ biggest);
        System.out.println("The smallest number of the array is  = "+ lowest);
    }
}