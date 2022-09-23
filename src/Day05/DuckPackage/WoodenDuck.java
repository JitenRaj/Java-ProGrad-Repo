package Day05.DuckPackage;

public class WoodenDuck extends Duck implements Decoratable{
    @Override
    public boolean CanBeDecorated() {
        return true;
    }
}
