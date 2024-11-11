package part3.ch06;

import part3.model.StudentVO;

public class ClassObjectInstance {
    public static void main(String[] args) {
        StudentVO st1; // st1 : object
        StudentVO st2; // st2 : object
        StudentVO st3; // st3 : object

        st1 = new StudentVO("김재혁", "컴퓨터공학과", 27, "ttt@ttt.com", 20240802, "010-1010-0101"); // st1 : instance
        st2 = new StudentVO("김재혁1", "컴퓨터공학과1", 27, "ttt@ttt.com", 20240802, "010-1010-0101"); // st2 : instance
        st3 = new StudentVO("김재혁2", "컴퓨터공학과2", 27, "ttt@ttt.com", 20240802, "010-1010-0101"); // st3 : instance

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

    }
}
