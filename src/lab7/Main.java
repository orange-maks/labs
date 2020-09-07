package lab7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> mas=new ArrayList<Integer>();
        mas.add(1);
        mas.add(29);
        mas.add(0,99);
        mas.add(105415);
        ArrayList<Integer> mas2 = mas;
        mas.addAll(mas2);
        for (int q: mas) System.out.print(q+" ");
        System.out.println();
        for (int q:mas2) System.out.print(q+" ");
        System.out.println("\nSize of mas = "+mas.size());
        mas.remove(2);
        for (int q: mas) System.out.print(q+" ");
        System.out.println("\nmas == mas2? "+mas.equals(mas2));
        System.out.println("hasCode="+mas.hashCode());
        System.out.println(mas.indexOf(99));
        mas.clear();
        System.out.println("mas is cleared");
        for (int q: mas) System.out.print(q+" ");
    }
}
