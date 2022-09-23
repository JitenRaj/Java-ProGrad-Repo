public class StringsLexicographicallyChecker {
    public static void main(String[] args) {

        System.out.println( lexoChecker("Apple", "Apple") );

        System.out.println( lexoChecker("mango" , "apple") );
    }

    public static boolean lexoChecker(String str1, String str2){

        if(str1.compareTo(str2) == 0)
            return true;

        else
            return false;
    }
}
