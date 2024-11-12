package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        number = Math.abs(number);
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return reverse == Math.abs(originalNumber);
    }
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String numString = Integer.toString(number);
        String[] numberWords = {
                "Zero", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine"
        };
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numString.length(); i++) {
            char digit = numString.charAt(i);
            int digitValue = Character.getNumericValue(digit);
            if (i > 0) {
                result.append(" ");
            }
            result.append(numberWords[digitValue]);
        }
        return result.toString().trim();
    }
}
