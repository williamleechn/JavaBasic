/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author libin
 */
public class LAB5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchMethodException {
        // TODO code application logic here
        QuestionManager questionManager = new QuestionManager();
        Scanner input = new Scanner(System.in);
        String selectQuestion;
        System.out.println("Which question you want to check ? Please enter Q1 , Q2Method1 , Q2Method2 , Q3 , Q4Method1 , Q4Method2 , Q5 , Q6");
        selectQuestion = input.next();
        switch (selectQuestion) {
            case "Q1":
                questionManager.Q1();
                break;
            case "Q2Method1":
                questionManager.Q2Method1();
                break;
            case "Q2Method2":
                questionManager.Q2Method2();
                break;
            case "Q3":
                questionManager.Q3();
                break;
            case "Q4Method1":
                questionManager.Q4Method1();
                break;
            case "Q4Method2":
                questionManager.Q4Method2();
                break;
            case "Q5":
                questionManager.Q5();
                break;
            case "Q6":
                questionManager.Q6();
                break;
            default:
                System.out.println("YO");
                ;
                break;
        }
    }

}
