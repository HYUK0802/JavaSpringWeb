package part3.ch05;

import part3.model.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        // 객체배열을 이용하여 4명의 학생 데이터를 저장하고 출력하세요
        StudentVO[] st = new StudentVO[4];
        st[0] = new StudentVO("김재혁", "컴퓨터공학과", 27, "ttt@ttt.com", 20240802, "010-1010-0101");
        st[1] = new StudentVO("김재혁1", "호텔", 24, "aaa@aaa.com", 20240212, "010-1111-2101");
        st[2] = new StudentVO("김재혁2", "건축", 23, "bbbb@bbb.com", 20240102, "010-2222-3101");
        st[3] = new StudentVO("김재혁3", "건축", 23, "bbbb@bbb.com", 20240102, "010-2222-3101");
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].toString());
        }
        for(StudentVO std : st){
            System.out.println(std.toString());
        }
    }
}
