package part3.ch05;

import part3.model.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        // 정수 6개를 저장할 배열을 생성하세요.
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 67;
        arr[3] = 98;
        arr[4] = 55;
        arr[5] = 32;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 잘 설계된 학생 객체를 설계하고 데이터를 저장 한 후 출력하세요.
        StudentVO vo = new StudentVO("김재혁", "컴퓨터공학과", 27, "ttt@ttt.com", 20240802, "010-1010-0101");
        System.out.println(vo);
    }
}