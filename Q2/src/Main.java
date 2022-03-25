import java.util.InputMismatchException;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p, q;
        Rational num = null;
        Rational operations= null;
        boolean flag=true;
        while (flag){
            System.out.println("please enter two numbers numerator and a denominator");
//            scan.nextLine(); //empty scanner object
            try {
                p = scan.nextInt();
                q = scan.nextInt();
                num = new Rational(p, q);

            } catch (IllegalArgumentException e) {
                System.out.println("please enter a valid number");
                continue;
            } catch (InputMismatchException err) {
                System.out.println("please enter a valid numbers - not an integer");
                continue;
            }
            flag=false; //we got a valid input
        }
        Rational other= new Rational(0,3);
        boolean result = num.greaterThan(other);
        System.out.println("does num is grater than other?" + result);
        result = num.equals(other);
        System.out.println("does num is equals to other?" + result);
        operations= num.plus(other);
        System.out.println("The sum of num and other is " + operations.toString());
        operations=num.minus(other);
        System.out.println("The minus of num and other is " + operations.toString());
        operations=num.multiply(other);
        System.out.println("The multiply of num and other is " + operations.toString());
        try{
            operations=num.divide(other);
            System.out.println("The divide of num and other is " + operations.toString());
        } catch (ArithmeticException e) {
            System.out.println("Impossible to divide in 0");
        }



    }
}

