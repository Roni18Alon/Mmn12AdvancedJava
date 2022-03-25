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

    public String toString(){
        return this.p+"/"+this.q;
    }

    public boolean greaterThan(Rational other) {
        return this.p * other.q > this.q * other.p;
    }

    public boolean equals(Rational other) {
        return this.p * other.q == this.q * other.p;
    }

    public Rational plus(Rational other) {// a/b+c/d= (ad+bc)/bd
        int newNumerator= this.p*other.q +this.q*other.p;
        int newDenominator= this.q*other.q;
        return new Rational(newNumerator,newDenominator);
    }
    public Rational minus(Rational other) {// a/b-c/d= (ad-bc)/bd => (ad+bc-2bc)/bd so its the same denominator but -2bc/bd from the plus
        Rational plus = this.plus(other);
        int newNumerator=plus.p-2*this.q*other.p;
        return new Rational(newNumerator,plus.q);
    }

    public Rational multiply(Rational other) { // (a/b) * (c/d) = (a*c)/(b*d)
        int newNumerator= this.p*other.p ;
        int newDenominator= this.q*other.q;
        return new Rational(newNumerator,newDenominator);
    }

    public Rational divide(Rational other) throws ArithmeticException {
        if (other.p==0 ){
            throw new ArithmeticException();
        }
        int newNumerator= this.p*other.q ;
        int newDenominator= this.q*other.p;
        return new Rational(newNumerator,newDenominator);
    }
//    public Rational reduce() {
//        return
//    }
}