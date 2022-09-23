package Day04.Generics;

public class DriverClass {
    public static void main(String[] args) {

        // Without generics
        DemoClassWithoutGenerics objectWithoutGenerics1 = new DemoClassWithoutGenerics();

        objectWithoutGenerics1.set("name");

        System.out.println(objectWithoutGenerics1.get());

        //
        DemoClassWithoutGenerics objectWithoutGenerics2 = new DemoClassWithoutGenerics();

        objectWithoutGenerics2.set(1);

        System.out.println(objectWithoutGenerics2.get());

        // With generics

        DemoClassWithGenerics<Integer> objectWithGenerics1 = new DemoClassWithGenerics<>();

        objectWithGenerics1.set(1);

        DemoClassWithGenerics<String> objectWithGenerics2 = new DemoClassWithGenerics<>();

        //objectWithGenerics2.set(2);
    }
}
