import java.util.Scanner;

public class PowerUsingForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "Enter number 1 : ");
        int num1 = scan.nextInt();
        System.out.println( "Enter number 2 : ");
        int num2 = scan.nextInt();

        int result = 1;

        for(int i=0; i<num2; i++){
            result *= num1 ;
        }

        System.out.println("Result is : " + result);
    }
}