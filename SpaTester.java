
import java.io.PrintStream;
import java.util.Scanner;

public class SpaTester {
    public static void main(String[] args) {
        SpaRewards reward;
        reward = new SpaRewards();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of manicures: ");
        int numberOfManicures = in.nextInt();
        System.out.print("Enter number of referrals: ");
        int numberOfReferrals = in.nextInt();
        System.out.printf("The discount is equal to: "+ reward.calculateDiscount(numberOfManicures,numberOfReferrals)+".00");


    }
}