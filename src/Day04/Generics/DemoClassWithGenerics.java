package Day04.Generics;

public class DemoClassWithGenerics<Type> {
    private Type t;

    public void set(Type t) {
        this.t = t;
    }

    public Type get() {
        return t;
    }
}
