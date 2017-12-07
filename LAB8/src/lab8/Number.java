/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author libin
 */
public class Number {

    int num = 10;
    int scale = 100;

    public Number() {
    }

    public Number(int num) {
        this.num = num;
    }

    public Number(int num, int scale) {
        this.num = num;
        this.scale = scale;
    }

    public void displayEven() {
        Random random = new Random();
        int[] list = new int[num];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(scale);
        }
        System.out.println("This Array is vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println(Arrays.toString(list));
        System.out.println("The even number of this Array is :");
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                System.out.print(list[i] + " ");
            }
        }
        System.out.println("\nTHE END OF THIS METHOD-----------------------");
    }

    public void displayPrime() {
        Random random = new Random();
        int[] list = new int[num];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(scale);
        }
        System.out.println("This Array is vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println(Arrays.toString(list));
        System.out.println("The prime number of this Array is :");
        for (int i = 0; i < list.length; i++) {
            if (isPrime(list[i])) {
                System.out.print(list[i] + " ");
            }
        }
        System.out.println("\nTHE END OF THIS METHOD-----------------------");
    }

    public void displayMaxNum() {
        Random random = new Random();
        int[] list = new int[num];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(scale);
        }
        System.out.println("This Array is vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println(Arrays.toString(list));
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.println("The maximum number in the Array is  " + max);
        System.out.println("THE END OF THIS METHOD-----------------------");
    }

    public void displayMinNum() {
        Random random = new Random();
        int[] list = new int[num];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(scale);
        }
        System.out.println("This Array is vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println(Arrays.toString(list));
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        List listObject = Arrays.asList(list);
        System.out.println("The minimum number in the Array is  " + min);
        System.out.println("THE END OF THIS METHOD-----------------------");
    }

    public void displayAverageNum() {
        Random random = new Random();
        int sum = 0;
        int[] list = new int[num];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(scale);
        }
        System.out.println("This Array is vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];
        }
        double average = sum / list.length;
        System.out.println("Average value of array elements is : " + average);
        System.out.println("THE END OF THIS METHOD-----------------------");
    }

    public void displaySquareNum() {
        Random random = new Random();
        int sum = 0;
        int[] list = new int[num];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(scale);
        }
        System.out.println("This Array is vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println(Arrays.toString(list));
        System.out.println("Square this array vvvvvvvvvvvvvvvvvvvvvvvvvvv");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t" + (int) Math.pow(list[i], 2));
        }
        System.out.println("THE END OF THIS METHOD-----------------------");
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
