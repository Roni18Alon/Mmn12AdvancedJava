/*
Author: Roni Alon 315565176
The class create a rational number object by a given numerator and denominator,
and have the functions you can do on two rational numbers - grater than,equals, sum, minus, multiply , divide
 */

import static java.lang.Math.*;

public class Rational {
    private int p; // the numerator
    private int q; //the denominator

    public Rational(int p, int q) throws IllegalArgumentException {
        if (floor(p) == p && floor(q) == q && q > 0) {
            this.p = p;
            this.q = q;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getNumerator() {
        return this.p;
    }

    public int getDenominator() {
        return this.q;
    }

    public String toString() {
        return this.p + "/" + this.q;
    }

    //This method checks if this rational is grater than the param rational - return bool value
    public boolean greaterThan(Rational other) {
        return this.p * other.q > this.q * other.p;
    }

    //This method checks if this rational is equals than the param rational - return bool value
    public boolean equals(Rational other) {
        return this.p * other.q == this.q * other.p;
    }
    //This method returns a Rational obj that represents the sum of this rational number and param rational
    public Rational plus(Rational other) {// a/b+c/d= (ad+bc)/bd
        int newNumerator = this.p * other.q + this.q * other.p;
        int newDenominator = this.q * other.q;
        return new Rational(newNumerator, newDenominator);
    }

    //This method returns a Rational obj that represents the minus of this rational number and param rational
    public Rational minus(Rational other) {// a/b-c/d= (ad-bc)/bd => (ad+bc-2bc)/bd so its the same denominator but -2bc/bd from the plus
        Rational plus = this.plus(other);
        int newNumerator = plus.p - 2 * this.q * other.p;
        return new Rational(newNumerator, plus.q);
    }
    //This method returns a Rational obj that represents the multiply of this rational and param rational
    public Rational multiply(Rational other) { // (a/b) * (c/d) = (a*c)/(b*d)
        int newNumerator = this.p * other.p;
        int newDenominator = this.q * other.q;
        return new Rational(newNumerator, newDenominator);
    }

    //This method returns a Rational obj that represents the divide value of this rational and param rational
    public Rational divide(Rational other) throws ArithmeticException {
        if (other.p == 0) { //(a/b)/(c/d)=(a/b)*(d/c) -> check if other denominator is zero
            throw new ArithmeticException();//it's impossible to divide in zero
        }
        int newNumerator = this.p * other.q;
        int newDenominator = this.q * other.p;
        return new Rational(newNumerator, newDenominator);
    }
    //reduce the rational number by Euclid algorithm
    public Rational reduce() {
        int gcdNum=gcd(this.p,this.q);
        int newNumerator = this.p / gcdNum;
        int newDenominator = this.q / gcdNum;
        return new Rational(newNumerator, newDenominator);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
