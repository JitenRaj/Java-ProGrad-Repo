package Day08.AnimalTreeInheritance;

public class SingleInheritance {

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        // own class methods
        dog1.canSwim();
        dog1.canWalk();

        // parent class method
        dog1.breath();
    }
}
