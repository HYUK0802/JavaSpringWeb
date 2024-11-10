package part3.ch04;

import part3.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        // 생성자 메서드를 통해 PersonVO객체에 원하는 이름, 나이, 전화번호를 저장하고 toString() 메서드로 출력하세요
        PersonVO vo = new PersonVO("김재혁", 15, "010-3232-3232");
        System.out.println(vo);
    }
}
