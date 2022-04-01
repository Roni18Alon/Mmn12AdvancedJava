/*
Author: Roni Alon 315565176
The class gets 2 rational numbers inputs from the user and use the Rational class methods
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rational operations,reduce;
        boolean flag=true;
        Rational firstNum = getRational(scan, flag);
        System.out.println("The first Rational number you entered is " + firstNum.toString());
        System.out.println("Pleases enter your second Rational number");
        Rational secondNum= getRational(scan,flag);
        System.out.println("The second valid Rational number you entered is " + secondNum.toString());

        //check if first number is grater than the second number - return bool value
        System.out.println("does num is grater than other?" + firstNum.greaterThan(secondNum));

        //check if first number is equals to the second number - return bool value
        System.out.println("does num is equals to other?" + firstNum.equals(secondNum));

        //print the sum of both rationals
        System.out.println("The sum of first rational and second rational is " + firstNum.plus(secondNum).reduce().toString());

        //print the minus of both rationals
        System.out.println("The reduced minus of num and other is " + firstNum.minus(secondNum).reduce().toString());

        //print the multiply value of both rationals
        System.out.println("The multiply of num and other is " + firstNum.multiply(secondNum).reduce().toString());

        try{
            //print the divide value of both rationals
            System.out.println("The reduced divide of num and other is " + firstNum.divide(secondNum).reduce().toString());
        } catch (ArithmeticException e) {
            System.out.println("Impossible to divide in 0");
        }

    }

    //This method gets two numbers and create a new Rational number object from them
    private static Rational getRational(Scanner scan, boolean flag) {
        int p;
        int q;
        Rational num=null;

        while (flag) {
            System.out.println("please enter two numbers numerator and a denominator");
            try {
                p = scan.nextInt();
                q = scan.nextInt();
                num = new Rational(p, q);
            } catch (IllegalArgumentException err) { //error from the constructor
                System.out.println("Please enter a valid numbers - the numerator is an Integer , the denominator must be positive");
                scan.nextLine(); //empty scanner object
                continue;
           }
            catch (InputMismatchException err) { //error of illegal input - only integers
                System.out.println("please enter a valid number only Integers");
                scan.nextLine(); //empty scanner object
                continue;
            }
            flag = false; //we got a valid input
        }
        return num;
    }
}

