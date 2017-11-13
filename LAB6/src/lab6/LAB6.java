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
public class LAB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        QuestionManager questionManager = new QuestionManager();
        Scanner input = new Scanner(System.in);
        String selectQuestion;
        System.out.println("Which question you want to check ? Please enter Q1 , Q2 , Q3 , Q4 , Q5 , Q6 TO VIEW THE ANSWER");
        selectQuestion = input.next();
        switch (selectQuestion) {
            case "Q1":
                questionManager.Q1();
                break;
            case "Q2":
                System.out.println("Enter n");
                int n = input.nextInt();
                System.out.println("Enter a char");
                char ch = input.next().charAt(0);
                questionManager.Q2(n, ch);
                break;
            case "Q3":
                questionManager.Q3();
                break;
            case "Q4":
                System.out.println("Please enter a positive Integer number");
                int a = input.nextInt();
                System.out.println("Please enter another positive Integer number");
                int b = input.nextInt();
                questionManager.Q4(a, b);
                break;
            case "Q5":
                questionManager.Q5();
                break;
            case "Q6":
                System.out.println("Please enter a number : ");
                int number = input.nextInt();
                questionManager.Q6(number);
                break;
            default:
                System.out.println("YO");
                ;
                break;
        }

    }
}
