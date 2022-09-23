package Day08.AnimalTreeInheritance;

public class AnimalClass {
    String animalName ;
    public AnimalClass(String name){
        this.animalName = name;
    }
    public static void main(String[] args) {
        AnimalClass animal = new AnimalClass("Dog");

        System.out.println(animal.animalName);
    }
}
