package Day08.AnimalTreeInheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Husky husky = new Husky();

        // own class method
        husky.efforts();

        // parent class methods
        husky.canSwim();
        husky.canWalk();

        // grandparent class method
        husky.breath();

    }
}
