package lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int mas[]=new int[n];
        for (int i=0;i<n;++i) mas[i]=sc.nextInt();
        int sum_for=0,sum_while=0,sum_do=0;
        for (int i=0;i<n;++i) sum_for+=mas[i];
        int i=0;
        while (i<n){
            sum_while+=mas[i];
            ++i;
        }
        i=0;
        do{
            sum_do+=mas[i];
            ++i;
        }while (i<n);
        System.out.println(sum_for+" "+sum_while+" "+sum_do);
    }
}
