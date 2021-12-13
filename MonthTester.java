import java.util.Scanner;

public class MonthTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number 1-12: ");
        int number = in.nextInt();
        System.out.println("Expected output values for 1 is January, 2 is for February, etc. until 12");
        System.out.printf("The month is %s", MonthGetter.getMonth(number));
    }
}
