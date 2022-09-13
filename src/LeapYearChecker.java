public class LeapYearChecker {
    public static void main(String[] args) {

        System.out.println( isLeapYear(1999));
        System.out.println( isLeapYear(2000));
        System.out.println( isLeapYear(1700));
    }

    public static boolean isLeapYear(int year) {
        if(year % 400 == 0)
            return true;

        if(year % 100 == 0)
            return false;

        if(year % 4 == 0)
            return true;

        return false;
    }
}
