package First;



import java.util.Scanner;

public class Calculator {

    static void add(double data1, double data2) {

        System.out.print("The result is" + (data1 + data2));
    }

    static void sub(double data1, double data2) {

        System.out.print("The result is" + (data1 - data2));
    }

    static void mult(double data1, double data2) {

        System.out.print("The result is" + (data1 * data2));
    }

    static void div(double data1, double data2) {

        System.out.print("The result is" + (data1 / data2));
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        int cal = scan.nextInt();
        double data1;
        double data2;

        switch (cal) {
            case 1:
                System.out.print("First number: ");
                data1 = scan.nextInt();

                System.out.print("Second number: ");
                data2 = scan.nextInt();
                add(data1, data2);
                break;

            case 2:
                System.out.print("First number: ");
                data1 = scan.nextInt();

                System.out.print("Second number: ");
                data2 = scan.nextInt();
                sub(data1, data2);
                break;
            case 3:

                System.out.print("First number: ");
                data1 = scan.nextInt();

                System.out.print("Second number: ");
                data2 = scan.nextInt();
                mult(data1, data2);
                break;
            case 4:
                System.out.print("First number: ");
                data1 = scan.nextInt();

                System.out.print("Second number: ");
                data2 = scan.nextInt();
                div(data1, data2);
                break;
            case 5:
                System.out.println("Exit");
                System.exit(0);

            default:
                System.out.println("Choose number between 1 - 5");
        }
    }

}