/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author libin
 */
public class WeightCalculator {

    private int age;
    private double height;
    double recomWeight;

    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public void recommendWeight() {
        recomWeight = (height - 100 + age / 10) * 0.9;
    }

    public void displayDetail() {
        System.out.println("Age : " + age);
        System.out.println("Height : " + height);
        System.out.println("RecommendWeight : " + recomWeight);

    }
}
