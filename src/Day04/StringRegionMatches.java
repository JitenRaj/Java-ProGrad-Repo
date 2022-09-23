package Day04;

public class StringRegionMatches {
    public static void main(String[] args) {
        String str1 = "Chemistry" ;

        String str2 = "Them" ;

        if( str1.regionMatches(2,str2, 2,2)){
            System.out.println("Yes, it matches");
        } else {
            System.out.println("it doesn't matches");
        }
    }
}
