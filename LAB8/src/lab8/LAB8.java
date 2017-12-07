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
public class LAB8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuestionManager questionManager = new QuestionManager();
        Scanner input = new Scanner(System.in);
        String selectQuestion;
        System.out.println("Which question you want to check ? Please enter Q1Constructor1, Q1Constructor2, Q1Constructor3 , Q2 , Q3 , Q4 , Q5 , Q6 TO VIEW THE ANSWER");
        selectQuestion = input.next();
        switch (selectQuestion) {
            case "Q1Constructor1":
                questionManager.Q1Constructor1();
                break;
            case "Q1Constructor2":
                questionManager.Q1Constructor2();
                break;
            case "Q1Constructor3":
                questionManager.Q1Constructor3();
                break;
            case "Q2":
                questionManager.Q2();
                break;
            case "Q3":
                questionManager.Q3();
                break;
            case "Q4":
                questionManager.Q4();
                break;
            case "Q5":
                questionManager.Q5();
                break;
            case "Q6":
                questionManager.Q6();
                break;
            default:
                System.out.println("YO");
                break;
        }

    }
}
