package com.bridgelabz;
import java.util.Scanner;

public class Count_Distinct_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int distinctCount = 0;
        for (int i = 0; i < n; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctCount++;
            }
        }
        System.out.println("Number of distinct element: " + distinctCount);
        if (distinctCount < n) {
            System.out.println("Distinct element are:");
            for (int i = 0; i < n; i++) {
                boolean isDistinct = true;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        isDistinct = false;
                        break;
                    }
                }
                if (isDistinct) {
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }
}