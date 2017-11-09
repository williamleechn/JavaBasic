/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeJava.extend;

/**
 *
 * @author Bill
 */
public class QuestionManage {

    public String Q1() {

        int n1, n2;
        String operation;
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter first number");
        n1 = scannerObject.nextInt();

        System.out.println("Enter second number");
        n2 = scannerObject.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation");
        operation = op.next();
        String answer;
        switch (operation) {
            case "+":
                answer = "Your answer is " + (n1 + n2);
                break;
            case "-":
                answer = "Your answer is " + (n1 - n2);
                break;
            case "/":
                answer = "Your answer is " + (n1 / n2);
                break;
            case "*":
                answer = "Your asnwer is " + (n1 * n2);
                break;
            default:
                answer = "yo. Do you have freestyle ? ";
                break;
        }
        return answer;
    }

    public String Q2() {
        Random random = new Random();
        int n = random.nextInt(5) + 1;
        String answer;
        switch (n) {
            case 1:
                answer = n + " is one";
                break;
            case 2:
                answer = n + " is two";
                break;
            case 3:
                answer = n + " is three";
                break;
            case 4:
                answer = n + " is four";
                break;
            case 5:
                answer = n + " is five";
                break;
            default:
                answer = "yo. Do you have freestyle ? ";
                break;
        }
        return answer;
    }

    public String Q3() {
        DecimalFormat df = new DecimalFormat("0.00##");
        double n, c;

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the sales volume");
        n = scannerObject.nextDouble();

        if (n <= 100) {
            c = n * 0.05;
            return "Commission is  " + df.format(c);
        } else if (100 < n && n <= 500) {
            c = n * 0.075;
            return "Commission is  " + df.format(c);
        } else if (n < 500 && n <= 1000) {
            c = n * 0.1;
            return "Commission is  " + df.format(c);
        } else if (n > 1000) {
            c = n * 0.125;
            return "Commission is  " + df.format(c);
        }
        return "YO!";
    }

    public String Q4() {
        Random random = new Random();
        int p1, p2;
        p1 = random.nextInt(6) + 1 + random.nextInt(6) + 1;
        System.out.println("Player 1 get point " + p1);
        p2 = random.nextInt(6) + 1 + random.nextInt(6) + 1;
        System.out.println("Player 2 get point " + p2);
        if (p1 > p2) {
            return "Player1 is winer!!!";
        } else if (p1 == p2) {
            return "No winer, draw !!!";
        } else {
            return "Player 2 is winer!!!";
        }
    }

    public String Q5() {
        Scanner scannerObject = new Scanner(System.in);
        int a, b, c, d, e, f;
        double x = 0, y = 0;
        System.out.println("Enter a :");
        a = scannerObject.nextInt();
        System.out.println("Enter b :");
        b = scannerObject.nextInt();
        System.out.println("Enter c :");
        c = scannerObject.nextInt();
        System.out.println("Enter d :");
        d = scannerObject.nextInt();
        System.out.println("Enter e :");
        e = scannerObject.nextInt();
        System.out.println("Enter f :");
        f = scannerObject.nextInt();
        x = (e * d - b * f) / (a * d - b * c);

        y = (a * f - e * c) / (a * d - b * c);

        if (a * d - b * c == 0) {
            return "The equation has no solution";
        } else {
            return "x is  " + x + "  and y is  " + y;
        }

    }

    public String Q6() {
        Scanner scannerObject = new Scanner(System.in);
        int radius, x, y;
        double a;
        System.out.println("Enter the radius :");
        radius = scannerObject.nextInt();
        System.out.println("Enter the x :");
        x = scannerObject.nextInt();
        System.out.println("Enter the y :");
        y = scannerObject.nextInt();
        a = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (a <= radius) {
            return "Point is inside the circle";
        } else {
            return "Point is outside the circle";
        }
    }
}
