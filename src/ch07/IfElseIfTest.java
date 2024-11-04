package ch07;

public class IfElseIfTest {
    public static void main(String[] args) {
        int point = 79;
        if (point >= 0 && point <= 100) {
            if (point >= 90) {
                System.out.println("A반");
            } else if (point >= 85) {
                System.out.println("B반");
            }else if(point>=80) {
                System.out.println("C반");
            }else {
                System.out.println("불합격");
            }
        }else {
            System.out.println("점수를 다시 입력하세요");
        }
    }
}
