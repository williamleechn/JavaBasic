/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author libin
 */
public class QuestionManager {

    public void Q1() {
        int numOfSt, lowest, highest, total = 0;
        double average = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an number of students");
        numOfSt = input.nextInt();

        int[] scoresList = new int[numOfSt];

        //generate the score list of N students
        for (int i = 0; i <= scoresList.length - 1; i++) {
            scoresList[i] = (int) (Math.random() * 100);
        }

        //find the lowest score
        lowest = scoresList[0];

        for (int i = 1; i <= scoresList.length - 1; i++) {
            if (scoresList[i] < lowest) {
                lowest = scoresList[i];
            }
        }

        System.out.println("\nThe lowest score is : " + lowest);

        //find the highest score
        highest = scoresList[0];

        for (int i = 1; i <= scoresList.length - 1; i++) {
            if (scoresList[i] > highest) {
                highest = scoresList[i];
            }
        }

        System.out.println("\nThe highest score is : " + highest);

        //find the average score
        for (int i = 0; i <= scoresList.length - 1; i++) {
            total = total + scoresList[i];
        }

        average = total / numOfSt;
        System.out.println("\nThe average score is : " + average);
    }

    public void Q2Method1() {
        Integer[] list = new Integer[21];
        Integer[] randomList = new Integer[10];
        for (Integer i = 0; i < list.length; i++) {
            list[i] = i;
        }
        Collections.shuffle(Arrays.asList(list));
        System.out.println(Arrays.toString(list));

        for (Integer i = 0; i < randomList.length; i++) {
            randomList[i] = list[i];
        }
        System.out.println("Select 10 number is    " + Arrays.toString(randomList));
    }

    public void Q2Method2() {
        int list[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            boolean found = false;
            int r = 0;
            do {
                found = false;
                r = random.nextInt(20);
                for (int j = 0; j < list.length; j++) {
                    if (list[j] == r) {
                        found = true;
                        break;
                    }
                }
            } while (found);

            list[i] = r;
        }
        System.out.println(Arrays.toString(list));
    }

}
