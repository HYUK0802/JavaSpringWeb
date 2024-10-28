package ch04;

import java.util.Scanner;

public class FourArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("덧셈은 = sum, 뺄셈은 = min, 나눗셈 = div, 곱셈 = mul 를 입력하세요");
        String ans = sc.next();
        int sum = a+b;
        int min = a-b;
        int div = a/b;
        int mul = a*b;

        if (ans.equals("sum") ) {
            System.out.println(a +" + "+ b +"의 덧셈은 = " + sum);
        } else if (ans.equals("min")) {
            System.out.println(a +" - "+ b +"의 뺄셈은 = " + min);
        } else if (ans.equals("div")) {
            System.out.println(a +" / "+ b +"의 나눗셈은 = " + div);
        } else if (ans.equals("mul")) {
            System.out.println(a +" * "+ b +"의 곱셈은 = " + mul);
        }else {
            System.out.println("기호를 제대로 입력하세요");
        }

    }
}
