/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import javafx.beans.binding.Bindings;

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

    public void Q3() {
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of employee");
        int emp = input.nextInt();
        int[][] matrix = new int[emp][7];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < 7; column++) {
                matrix[row][column] = (int) ((Math.random() * 8) + 1);
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int[][] matrixResult = new int[emp][0];
        for (int row = 0; row < matrixResult.length; row++) {
            int total = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
            System.out.println("Sum work hours for employee  " + row + " :   is   " + total);
        }
    }

    public void Q4Method1() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = i * 3 + j;
            }
        }
        System.out.println("This is previuos view : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - i][j];
                matrix[len - 1 - i][j] = temp;
            }
        }
        System.out.println("After 90 degree rotate : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public void Q4Method2() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = i * 3 + j;
            }
        }
        System.out.println("This is previuos view : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        int temp;
        final int len = matrix.length;
        // For each concentric square around the middle of the matrix to rotate...
        // This value will be used as (m, n) offset when moving in.
        // Integer division by 2 will skip center if odd length.
        for (int s = 0; s < len / 2; s++) // for the length of this ring
        {
            for (int i = 0; i < len - 2 * s - 1; i++) {
                temp = matrix[s][s + i];
                matrix[s][s + i] = matrix[len - s - i - 1][s];
                matrix[len - s - i - 1][s] = matrix[len - s - 1][len - s - i - 1];
                matrix[len - s - 1][len - s - i - 1] = matrix[s + i][len - s - 1];
                matrix[s + i][len - s - 1] = temp;
            }
        }
        System.out.println("After 90 degree rotate : ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public void Q5() {
        int[] list = new int[20];

        for (int i = 0; i < 10; i++) {
            list[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] > currentMax) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to search :");
        int num;
        num = input.nextInt();
        int countLinear = 0;
        int countBinary = 0;
        int low = list.length - 1;
        int high = 0;

        while (low >= high) {
            int mid = (low + high) / 2;
            if (num < list[mid]) {
                countBinary++;
                high = mid + 1;
            } else if (num == list[mid]) {
                System.out.println("The number was found in the list.");
                System.out.println("Binary Search - " + countBinary + "  loops .");
                break;
            } else {
                countBinary++;
                low = mid - 1;
            }
        }

        for (int i = 0; i < list.length; i++) {
            countLinear++;
            if (num == list[i]) {
                System.out.println("The number was found in the list.");
                break;
            } else if (i == list.length - 1 && num != list[i]) {
                System.out.println("The number was not found in the list.");
            }
        }
        System.out.println("Linear Search - " + countLinear + "  loops .");
    }

    public void Q6() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how manny rows you want :");
        int num = input.nextInt();
        int matrix[][] = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < num; i++) {
            matrix[i][0] = 1;
        }
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(matrix));
    }
}
