/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Bill
 */
public class QuestionManage {

    public void Q1() {

        int Number, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any number to Find Factors: ");
        Number = sc.nextInt();

        for (i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                System.out.format(" %d  ", i);
            }

        }
    }

    public void Q2() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any number : ");
        int Number = sc.nextInt();
        for (int i = 1; i <= Number; i++) {
            sum = sum + i;
        }
        System.out.println("The Sum Of " + Number + " Numbers are:" + sum);
    }

    public void Q3() {
        int sum = 0;
        int inputNum;
        int counter;
        float average;
        double Max = 0;
        double Min = 101;

        Scanner NumScanner = new Scanner(System.in);
        Scanner charScanner = new Scanner(System.in);
        System.out.println("Enter the total number of exams you want a average");
        counter = NumScanner.nextInt();
        System.out.println("Please enter " + counter + " numbers:");

        for (int i = 1; i <= counter; i++) {
            inputNum = NumScanner.nextInt();
            sum = sum + inputNum;
            System.out.println();

            if (inputNum > Max) {
                Max = inputNum;
            }
            if (inputNum < Min) {
                Min = inputNum;
            }
            if (inputNum > -1 && inputNum < 101) {
                sum = sum + inputNum;
            } else {
                System.out.println("You entered a number that wasn't in the range of 0 to 100");
                average = sum / counter;
            }
        }
    }

}

}
