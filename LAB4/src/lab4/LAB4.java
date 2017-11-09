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
public class LAB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        QuestionManage questionManage = new QuestionManage();

        int no;
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("which questions answer you want to see ? enter the question no.");
        no = scannerObject.nextInt();
        switch (no) {
            case 1:
                System.out.println(questionManage.Q1());
                break;
            case 2:
                System.out.println(questionManage.Q2());
                break;
            case 3:
                System.out.println(questionManage.Q3());
                break;
            case 4:
                System.out.println(questionManage.Q4());
                break;
            case 5:
                System.out.println(questionManage.Q5());
                break;
            case 6:
                System.out.println(questionManage.Q6());
                break;
            default:
                System.out.println("YO");;
                break;
        }

    }
    }
    
}
