package Day08.AnimalTreeInheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        GermanShepherd GerShep = new GermanShepherd();

        // own method
        GerShep.securityDog();

        // parent class methods
        GerShep.canWalk();
        GerShep.canSwim();

        // multiple interfaces methods
        GerShep.keepable();
        GerShep.winterSurvivable();
    }
}
