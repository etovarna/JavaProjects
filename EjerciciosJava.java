/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.curso.ejerciciosjava;

public class EjerciciosJava {

    public static boolean isPalindrome(String word) {

        boolean isPalindrome = true;

        for (int i = 0; i < (word.length() / 2) && isPalindrome; i++) {
            if (Character.toLowerCase(word.charAt(word.length() - (i + 1))) != Character.toLowerCase(word.charAt(i))) {
                isPalindrome = false;
            }
        }
        return isPalindrome;

    }

    public static boolean isNumberPalindrome(int number) {

        boolean isPalindrome = true;
        int remainder;
        int reversed = 0;
        int aux_number = number;

        while (aux_number > 0) {
            remainder = aux_number % 10;
            reversed = reversed * 10 + remainder;

            aux_number /= 10;
        }
        if (number != reversed) {
            isPalindrome = false;
        }
        return isPalindrome;

    }

    public static int getFactorial(int number) {

        if (number == 0) {
            return 1;
        } else if (number == 1) {
            return 1;
        }
        return number * getFactorial(number - 1);

    }

    public static int getGCD(int a, int b) {

        if (a % b == 0) return b;
        else return getGCD(b, a % b);
        
    }

    public static int digits(int number) {

        int digits = 0;

        while (number != 0) {
            digits++;
            number /= 10;
        }
        return digits;

    }

    public static boolean isArmstrong(int number) {

        int n = digits(number);
        int aux_number = number;
        double sum = 0;
        boolean isArmstrong = true;

        while (aux_number != 0) {
            int remainder = aux_number % 10;
            sum = sum + Math.pow(remainder, n);
            aux_number /= 10;
        }
        if (number != sum) {
            isArmstrong = false;
        }
        return isArmstrong;

    }

    public static String reverseString(String word) {

        String reversedChain = "";

        for (int i = 1; i < word.length()+1; i++) {
            reversedChain += word.charAt(word.length()-i);
        }
        return reversedChain;

    }

    public static int[] packageCounter(int weight) {

        int aux_weight = weight;
        int num_packages[] = new int[2];

        if (weight < 0) {
            throw new IllegalArgumentException("Please enter a weight > 0!");
        }

        num_packages[0] = aux_weight / 5;
        aux_weight -= num_packages[0] * 5;

        num_packages[1] = aux_weight / 3;
        aux_weight -= num_packages[1] * 3;

        num_packages[2] = aux_weight / 1;

        return num_packages;
    }

    public static int romanToDecimal(char roman) {

        if (roman == 'I') {
            return 1;
        }
        if (roman == 'V') {
            return 5;
        }
        if (roman == 'X') {
            return 10;
        }
        if (roman == 'L') {
            return 50;
        }
        if (roman == 'C') {
            return 100;
        }
        if (roman == 'D') {
            return 500;
        }
        if (roman == 'M') {
            return 1000;
        }
        return -1;

    }

    public static int romanToDecimal(String roman) {

        int decimal = 0;

        for (int i = 0; i < roman.length(); i++) {
            int a = romanToDecimal(roman.charAt(i));
            if (i + 1 < roman.length()) {
                int b = romanToDecimal(roman.charAt(i + 1));
                if (a >= b) {
                    decimal = decimal + a;
                } else {
                    decimal = decimal + b - a;
                    i++;
                }
            } else {
                decimal = decimal + a;
            }
        }

        return decimal;
    }

    public static int getFibonacci1(int number) {
        
        if (number < 2) return number;
        else return getFibonacci1(number-1)+getFibonacci1(number-2);
        
    }

    public static int getFibonacci2(int number) {
        
        int fibonacci[] = new int[number+1];
        int i;
        
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (i = 2; i <= number; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        return fibonacci[number];
    }

    public static void main(String[] args) {

        String palindrome = "Reconocer";
        int numberPalindrome = 123454321;
        int factorial = 10;
        int a = 248, b = 250;
        int Armstrong = 153;
        String reverseString = "casa";
        String romanNumber = "LXXIII";
        int fibonacci = 10;

        System.out.println("Is " + palindrome + " a palindrome? " + isPalindrome(palindrome));
        System.out.println("Is " + numberPalindrome + " a palindrome? " + isNumberPalindrome(numberPalindrome));
        System.out.println("The factorial of " + factorial + " is " + getFactorial(factorial));
        System.out.println("The GCD of " + a + " and " + b + " is " + getGCD(a, b));
        System.out.println("Is " + Armstrong + " an Amstrong number? " + isArmstrong(153));
        System.out.println("The reverse string of " + reverseString + " is " + reverseString(reverseString));
        System.out.println("The roman number "+romanNumber+" in decimal is "+romanToDecimal(romanNumber));
        System.out.println("The "+fibonacci+ "th fibonacci number is "+getFibonacci2(fibonacci));
        
    }
}
