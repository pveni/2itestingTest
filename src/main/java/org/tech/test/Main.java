package org.tech.test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int findMaxSum(String[] array) {
        int maxSum = 0;

        for (String str : array) {
            int sum = 0;
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    sum += Character.getNumericValue(ch);
                }
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array length (not more than 10): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n > 10) {
            System.out.println("Array length is larger than 10. Terminating...");
            System.exit(0);
        }

        String[] input = new String[n];

        System.out.println("Enter the string length. Should not be greater than 12 characters:");
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            input[i] = scanner.nextLine();
            if (input[i].length() > 12) {
                System.out.println("String length exceeds 12 characters. Please enter again.");
                i--;
            }
        }

        scanner.close();

        System.out.println("Input" + Arrays.toString(input));
        System.out.println("Output is: " + findLargestSumOfDigits(input));
    }
}