package Day05.DuckPackage;

public class MallardDuck extends Duck implements Flyable, Noiseable, Swimmable, Walkable{
    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canMakeNoise() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}
