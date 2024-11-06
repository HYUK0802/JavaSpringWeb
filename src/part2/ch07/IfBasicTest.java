package part2.ch07;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        // x의 값이 0 보다 큰 경우에만 양수입니다 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int x = sc.nextInt();
        if(x>0){
            System.out.println("양수입니다.");
        }else{
            System.out.println("음수입니다.");
        }
        System.out.println("숫자를 입력해주세요");
        int y = sc.nextInt();
        if (y % 7 == 0) {
            System.out.println("7의 배수입니다");
        }else{
            System.out.println("7의 배수가 아닙니다.");
        }
        System.out.println("종료되었습니다.");


    }
}
