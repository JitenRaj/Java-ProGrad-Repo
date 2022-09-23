package Day06.MultiLevelPolymorphism;

public class FamilyProfessionIdentifier {
    public static void main(String[] args) {

        You youSelf= new You();

        youSelf.profession();


        YourGrandFather you = new You();

        you.swim();
    }
}
