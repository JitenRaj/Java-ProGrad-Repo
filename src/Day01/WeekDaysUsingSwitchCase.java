import com.sun.javafx.beans.annotations.Default;

public class WeekDaysUsingSwitchCase {
    public static void main(String[] args) {

        nameOfDay(1);

        nameOfDay(7);

        nameOfDay(10);
    }

    public static void nameOfDay(int day) {
        switch (day){
            case 1 :
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;

            case 3 :
                System.out.println("Wednesday");
                break;

            case 4 :
                System.out.println("Thrusday");
                break;

            case 5 :
                System.out.println("Friday");
                break;

            case 6 :
                System.out.println("Saturday");
                break;

            case 7 :
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Not a valid number. It Should be between 1 to 7");
        }
    }
}
