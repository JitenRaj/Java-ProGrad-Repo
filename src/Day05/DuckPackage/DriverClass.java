package Day05.DuckPackage;

public class DriverClass {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck rubberDuck = new RubberDuck();

        System.out.println(mallardDuck.getClass());
        System.out.println(woodenDuck.getClass());
        System.out.println(rubberDuck.getClass());



    }
}
