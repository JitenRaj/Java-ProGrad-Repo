package Day06.MultiLevelPolymorphism;

public class YourFather extends YourGrandFather{

    /*
    @Override
    void profession(){
        System.out.println("A Businessman.");
    }
    */

    @Override
    void profession() {
        super.profession();
    }

    void swim(){
        System.out.println("Father swim");
    }
}
