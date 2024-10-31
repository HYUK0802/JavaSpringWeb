package ch07;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = 10;
        if (x >= 0) {
            System.out.println("0 or 양수입니다.");
        }else {
            System.out.println("음수입니다.");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int su = sc.nextInt();
        if (su % 2 == 0) {
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }
        // 입력 받은 수가 12의 배수인지를 출력하는 코드를 작성하세요
        System.out.println("정수를 입력하세요");
        int num = sc.nextInt();
        if (num % 12 == 0) {
            System.out.println("12의 배수입니다.");
        }else {
            System.out.println("12의 배수가 아닙니다.");
        }
        // 윤년
        int year = sc.nextInt();
        System.out.println("년도를 입력하세요");
        if((num%4==0 && num%100==0) || num%400==0){
            System.out.println(year + "년도는 윤년입니다.");
        }else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
