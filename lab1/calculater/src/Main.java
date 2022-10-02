import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int fnumber = input.nextInt();
        System.out.print("Enter the operation: ( + , - , * , / ): ");
        String s = input.next();
        System.out.print("Enter number 2: ");
        int snumber = input.nextInt();
        switch (s) {
            case "+":
                System.out.println("the result is : " + add(fnumber, snumber));
                break;
            case "-":
                System.out.println("the result is : " + even(fnumber, snumber));
                break;
            case "*":
                System.out.println("the result is : " + multy(fnumber, snumber));
                break;
            case "/":
                div(fnumber, snumber);
                break;
            default:
                System.out.println("Not correct ");
                System.out.print("Enter a correct operation ( + , - , * , / )");
                break;
        }
    }

    public static int add(int fnum, int snum) {
        return fnum + snum;
    }

    public static int even(int fnum, int snum) {

        return fnum - snum;
    }

    public static int multy(int fnum, int snum) {
        return fnum * snum;
    }

    public static int div(int fnum, int snum) {
        int sum = 0;

        try {
            sum = fnum / snum;
            return sum;
        } catch (ArithmeticException ae) {
            System.out.println("the result is : infinity");
            return sum;
        }
    }
}