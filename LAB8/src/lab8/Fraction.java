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
public class Fraction {
    //Member variables

    private int numerator;

    private int denominator;

    //Constructors
    public Fraction() {

        numerator = 0;

        denominator = 1;

    }

    public Fraction(int initialNum, int initialDenom) {

        numerator = initialNum;

        if (initialDenom != 0) {
            denominator = initialDenom;
        } else {

            System.out.println("Fatal Error.");

            System.exit(0);

        }

    }

    //Accessor methods
    public int getNumerator() {

        return numerator;

    }

    public int getDenominator() {

        return denominator;

    }

    //Mutuator methods
    public void setNumerator(int numerator) {

        this.numerator = numerator;

    }

    public void setDenominator(int denominator) {

        if (denominator != 0) {
            this.denominator = denominator;
        } else {

            System.out.println("Fatal Error.");

            System.exit(0);

        }

    }

    //print fraction on screen
    public String toString() {
        return numerator + "/" + denominator;

    }

    //Other input
    public int greatestCommonDivisor(int numerator, int denominator) {

        //Find the lower of the two values to determine the ceiling for the valid range
        //Used the Math class min(int, int) method which compares two integers and returns the smaller value
        int length = Math.min(numerator, denominator);

        //Set the GCD equal to 0, so you have the lowest possible base of comparison
        int GCD = 0;

        //create a loop to test the range of values   
        for (int index = 1; index <= length; index++) {

            //if the index value can divide into both num and denom with no remainder, set GCD to the index
            if (numerator % index == 0 && denominator % index == 0) {

                GCD = index;
            }
        }
        return GCD;
    }

}
