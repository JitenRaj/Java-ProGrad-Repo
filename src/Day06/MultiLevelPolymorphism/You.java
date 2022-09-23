package Day06.MultiLevelPolymorphism;

public class You extends YourFather{

    /*
    @Override
    void profession() {
        System.out.println("An Engineer");
    }
    */

    @Override
    void profession() {
        super.profession();
    }

    void swim() {
        System.out.println("You swim");
    }
}
