package part3.ch04;

import model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        // 생성자 메서드를 통해 PersonVO객체에 이름, 나이, 전화번호를 저장하고 출력하세요
        PersonVO vo = new PersonVO();
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());

        PersonVO vo1 = new PersonVO();
        System.out.println(vo1.getName()+"\t"+vo1.getAge()+"\t"+vo1.getPhone());

        // 원하는 값으로 초기화 하는 방법?
    }
}
