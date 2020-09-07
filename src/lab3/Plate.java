package lab3;

public class Plate extends Dish {
    Plate(int weight){
        this.weight=weight;
    }
    @Override
    void Smash() {
        is_broken=true;
    }
}
