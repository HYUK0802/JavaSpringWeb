package part2.ch04;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        System.out.println(a +"+"+ b + "=" + sum);
    }
}
