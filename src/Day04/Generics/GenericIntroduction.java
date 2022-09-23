package Day04.Generics;

import java.util.ArrayList;

public class GenericIntroduction {
    public static void main(String[] args) {

        // Before generics.
        // Java Collection frameworks mostly takes type object as parameter/arguments
        // and return values from method as objects.

        ArrayList beforeGenericsList = new ArrayList();

        beforeGenericsList.add(10);
        beforeGenericsList.add(3.14);
        beforeGenericsList.add("Name");


        System.out.println(beforeGenericsList);

        // After generics.
        // Day04.Generics force type safety in java language

        ArrayList<Integer> afterGenericsList = new ArrayList<>();

        afterGenericsList.add(10);
        //afterGenericsList.add("Name");

        System.out.println(afterGenericsList);

        // Type safety and Type erasure
        // Day04.Generics add stability to your code by making more of your bugs detectable at compile time.
        // It essentially means that all the extra information added using generics
        // into source code will be removed from bytecode generated from it.
    }
}
