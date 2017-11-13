/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author libin
 */
public class QuestionManager {

    public void Q1() {
        int starting_number = 1;
        int ending_number = 20;
        System.out.println("List of Triangular Numbers ");
        for (int i = starting_number; i <= ending_number; i++) {
            int triangular = 0;
            for (int j = 1; j <= i; j++) {
                triangular = triangular + j;
            }
            System.out.println(i + " = " + triangular);
        }
    }

    public void Q2(int n, char ch) {
        int c, k, space = 1;
        space = n - 1;

        for (k = 1; k <= n; k++) {
            for (c = 1; c <= space; c++) {
                System.out.print(" ");
            }

            space--;

            for (c = 1; c <= 2 * k - 1; c++) {
                System.out.print(ch);
            }

            System.out.print("\n");
        }

        space = 1;

        for (k = 1; k <= n - 1; k++) {
            for (c = 1; c <= space; c++) {
                System.out.print(" ");
            }

            space++;

            for (c = 1; c <= 2 * (n - k) - 1; c++) {
                System.out.print(ch);
            }

            System.out.println("");
        }
    }

    public void Q3() {
        int[] list = new int[10];
        int num, temp, scope = list.length;
        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integer to store :");
            num = input.nextInt();
            list[i] = num;
        }
        for (int i = 0; i < list.length / 2; i++) {
            temp = list[i];
            list[i] = list[scope - i - 1];
            list[scope - i - 1] = temp;
        }
        System.out.println("THE REVERSE LIST IS :  ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public void Q4(int a, int b) {

        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        System.out.println("The GCD OF THIS TWO NUMBER IS   " + a);
    }

    public void Q5() {
        int third, second, first, score = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the third parameter enter negative number to quit : ");
            third = input.nextInt();
            System.out.println("Please enter the second parameter : ");
            second = input.nextInt();
            System.out.println("Please enter the first parameter : ");
            first = input.nextInt();
            System.out.println(first + " x " + second + " = " + third);
            if (first * second == third) {
                score = score + 2;
            }
        } while (third >= 0);
        System.out.println("Your score is  " + score);
    }

    public void Q6(int number) {
        System.out.println("---------------------------------------------------------------------------");
        int count = 0;
        for (int i = 10; count < 100; i++) {

            if (isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)) {
                System.out.printf("%10d", i);
                count++;
                if (count % 10 == 0 && i != 0) {
                    System.out.println();
                }

            }

        }
        System.out.println("---------------------------------------------------------------------------");
        if (isPrime(number) == true && isPrime(reverse(number))) {
            System.out.println("This number and its reverse is Prime");
        } else if (isPalindrome(number)) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This is NOT prime or palindrome, just a number! haha");
        }
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {

            reverse *= 10; // is ignored first iteration
            reverse += number % 10;
            number /= 10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {

        return (number == reverse(number));
    }

}
