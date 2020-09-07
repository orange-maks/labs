package lab4;

public class Obj implements Nameable {
    String name;
    public Obj(String name) {
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
}
