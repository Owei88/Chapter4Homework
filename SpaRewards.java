public class SpaRewards {
    public static int numOfManicures;
    public static int numOfReferrals;
    public int discountPercent;
//a
    public int calculateDiscount(int numOfManicures, int numOfReferrals){
        discountPercent = numOfManicures + numOfReferrals;
        if (discountPercent > 75){
            discountPercent = 75;
        }
        return discountPercent;
    }

}
