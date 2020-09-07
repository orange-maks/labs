package lab3;

public class Main {

    public static void main(String[] args) {
        Plate plate=new Plate(200);
        Fork fork=new Fork(100);
        System.out.println("Тарелка разбита?\n-"+plate.is_broken+"\nВилка разбита?\n-" +fork.is_broken);
        System.out.println("Веса:\n\tТарелка\t"+plate.weight+"\n\tВилка\t"+ fork.weight);
        System.out.println("*разбиваем посуду*");
        plate.Smash();
        fork.Smash();
        System.out.println("Тарелка разбита?\n-"+plate.is_broken+"\nВилка разбита?\n-" +fork.is_broken);
    }
}
