package part2.ch04;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어점수를 입력하세요.");
        int kor = sc.nextInt();
        System.out.println("영어점수를 입력하세요");
        int eng = sc.nextInt();
        int sum = kor + eng;
        int avg = (kor + eng) / 2;
        System.out.println("총점은 " + sum +" 이며 " + "평균은 " + avg + "입니다." );

    }
}
