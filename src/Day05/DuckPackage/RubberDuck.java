package Day05.DuckPackage;

public class RubberDuck extends Duck implements Noiseable, Squeezable, Floatable{
    @Override
    public boolean canFloat() {
        return true;
    }

    @Override
    public boolean canMakeNoise() {
        return true;
    }

    @Override
    public boolean canBeSqueezed() {
        return true;
    }
}
