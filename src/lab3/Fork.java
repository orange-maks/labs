package lab3;

public class Fork extends Dish {
    Fork(int weight){
        this.weight=weight;
    }
    @Override
    void Smash() {
        System.out.println("нельзя разбить вилку");
    }
}
