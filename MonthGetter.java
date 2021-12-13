public class MonthGetter {
    public static String month = "January  February March    April    May      June     July     August   " +
            "SeptemberOctober  November  December  ";

    /**
     * Gets the month based on the substring
     * @param number - the input of a user in the form of an input
     * @return returns the month using the substring of the variable month
     */
    public static String getMonth(int number){
        return month.substring(((number-1)+9),(number*9));
    }
}
