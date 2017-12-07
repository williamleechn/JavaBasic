/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author libin
 */
public class QuestionManager {

    public void Q1Constructor1() {
        Number a = new Number();
        a.displayAverageNum();
        a.displayEven();
        a.displayMaxNum();
        a.displayMinNum();
        a.displayPrime();
        a.displaySquareNum();
    }

    public void Q1Constructor2() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many random integers do you want to generate ?");
        int num = input.nextInt();
        Number a = new Number(num);
        a.displayAverageNum();
        a.displayEven();
        a.displayMaxNum();
        a.displayMinNum();
        a.displayPrime();
        a.displaySquareNum();
    }

    public void Q1Constructor3() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many random integers do you want to generate ?");
        int num = input.nextInt();
        System.out.println("What scale of integers do you want to generate ?");
        int scale = input.nextInt();
        Number a = new Number(num, scale);
        a.displayAverageNum();
        a.displayEven();
        a.displayMaxNum();
        a.displayMinNum();
        a.displayPrime();
        a.displaySquareNum();
    }

    public void Q2() {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name ?");
        String name = input.next();
        System.out.println("what is your ic ?");
        String ic = input.next();
        System.out.println("what is your passportNum ?");
        String passportNum = input.next();
        System.out.println("How much you want to first time deposit ?");
        double startBalance = input.nextDouble();
        BankAccount a = new BankAccount(name, ic, passportNum, startBalance);
        System.out.println("How much you want to deposit ?");
        double amount = input.nextDouble();
        a.setDeposit(amount);
        System.out.println("How much you want to withdraw ?");
        double amount2 = input.nextDouble();
        a.setWithdraw(amount2);
        System.out.println("How much you want to deposit ?");
        double amount3 = input.nextDouble();
        a.setDeposit(amount3);
        System.out.println("-----------------------------------------------");
        a.displayData();
    }

    public void Q3() {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your age ?");
        int age = input.nextInt();
        System.out.println("What is your height ?");
        double height = input.nextDouble();
        WeightCalculator a = new WeightCalculator(age, height);
        a.recommendWeight();
        a.displayDetail();
    }

    public void Q4() {
        Scanner input = new Scanner(System.in);
        System.out.println("what initial NUMERATOR you want  ?");
        int initialNum = input.nextInt();
        System.out.println("what initial DENOMINATOR you want  ?");
        int initialDenom = input.nextInt();
        Fraction a = new Fraction(initialNum, initialDenom);
        System.out.println("what NUMERATOR you want  ?");
        int initialNum1 = input.nextInt();
        System.out.println("what DENOMINATOR you want  ?");
        int initialDenom1 = input.nextInt();
        a.setDenominator(initialDenom1);
        a.setNumerator(initialNum1);
        a.getDenominator();
        a.getNumerator();
        System.out.println(a.toString());
        System.out.println("GCD initial is  " + a.greatestCommonDivisor(initialNum, initialNum));
        System.out.println("GCD is  " + a.greatestCommonDivisor(initialNum1, initialNum1));
    }

    public void Q5() {
        Scanner input = new Scanner(System.in);
        System.out.println("what is player1 name ?");
        String player1 = input.next();
        System.out.println("what is player2 name ?");
        String player2 = input.next();
        Game a = new Game(player1, player2);
        System.out.println("Who get the score 100 first who is the winner .");
        while (a.countPlayer1 < 100 && a.countPlayer2 < 100) {
            a.rollDice();
        }
        a.showScore();
        if (a.countPlayer1 > a.countPlayer2) {
            System.out.println("player 1 " + player1 + " is winner.");
        } else {
            System.out.println("player 2 " + player2 + " is winner.");
        }
    }

    public void Q6() {
        Scanner input = new Scanner(System.in);
        System.out.println("There are 10 burger stalls id from 0 - 9");
        BurgerStalls[] a = new BurgerStalls[10];
        System.out.println("Do you want to record ?");
        boolean answer = input.hasNext("y");
        if (answer == true) {
            System.out.println("Which stall sold a burger ? enter the id");
            int stallId = input.nextInt();
            a[stallId] = new BurgerStalls(stallId);
            a[stallId].sold();
        } else {
            System.out.println("thank you !");
        }
        int totalAmount = 0;
        for (int i = 0; i < a.length; i++) {
            totalAmount = totalAmount + a[i].getAmountSold();
        }
        System.out.println(totalAmount);
    }
}
