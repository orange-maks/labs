package lab2;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle=new Circle(5);
        System.out.println(circle.rad+" "+circle.area+" "+circle.pir);
        circle.resetRad(10);
        System.out.println(circle.rad+" "+circle.area+" "+circle.pir);
    }
}