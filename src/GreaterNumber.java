public class GreaterNumber {
    public static void main(String[] args) {

        System.out.println( isGreaterNumber(3,4,5));

        System.out.println( isGreaterNumber(4,5,3));

        System.out.println( isGreaterNumber(5,3,4));
    }

    public static int isGreaterNumber(int num1, int num2, int num3){
         if( num1 > num2 && num1 > num3)
             return num1;

         else if( num2 > num1 && num2 > num3)
             return num2;

         else
             return num3;
    }
}
