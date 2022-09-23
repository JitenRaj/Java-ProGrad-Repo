package Day08.AnimalTreeInheritance;

public class GermanShepherd extends Dog implements WinterSurvivable,Keepable{
    @Override
    public void keepable() {
        System.out.println("can be kept as pet.");
    }

    @Override
    public void winterSurvivable() {
        System.out.println("can survive in winter");
    }

    void securityDog(){
        System.out.println("Can provide security");
    }
}
