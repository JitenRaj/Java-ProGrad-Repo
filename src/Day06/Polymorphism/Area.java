package Day06.Polymorphism;

public class Area {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();

        System.out.println( rect.area(5,6));
        System.out.println(rect.area(5.5,4.5));

        System.out.println( square.area(7));
        System.out.println( square.area(6.5));

        System.out.println( circle.area(7));
    }
}

