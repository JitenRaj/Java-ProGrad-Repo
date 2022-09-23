package Day04;

public class PrimitiveToWrapperConversion {
    public static void main(String[] args) {

        int intNum1 = 9;
        double doubleNum1 = 6.78;

        Integer intObj1 = Integer.valueOf(intNum1);
        Double doubleObj1 = Double.valueOf(doubleNum1);


        if (intObj1 instanceof Integer) {
            System.out.println("An Object of Integer is created.");
        }

        if (doubleObj1 instanceof Double) {
            System.out.println("An Object of Double is created");
        }
    }
}

/*
Convert Primitive Type to Wrapper Objects (boxing/autoboxing)
For the following:
int a = 9;
double d = 6.78;
and check if they are converted to wrapper classes
Sample output:
An object of Integer is created.
An object of Double is created
 */
