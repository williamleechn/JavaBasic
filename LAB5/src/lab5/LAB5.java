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
    public static void main(String[] args) {
        // TODO code application logic here
       QuestionManager questionManager = new QuestionManager();
       Scanner input = new Scanner(System.in);
       String selectQuestion ;
        System.out.println("Which question you want to check ? Please enter Q1 , Q2Mehtod1 , Q2Method2");
        selectQuestion = input.next();
        System.out.println(questionManager.getClass().getMethod(selectQuestion, null));
    }
    
}
