
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
        System.out.printf("The discount is equal to: "+ reward.calculateDiscount(numberOfManicures,numberOfReferrals));
        System.out.println("The discount should be the number of manicures plus referrals, " +
                "unless it exceeds 75, in which case it will be 75");
        System.out.println("For example, 58 manicures and 4 referrals would be a discount of 62, but " +
                "78 manicure and 6 referrals would be a discount of 75");


    }
}