package part3.ch04;

import part3.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // 생성자 메서드를 통해 PersonVO객체에 원하는 이름, 나이 , 전화번호를 저장하고 출력하세요
        PersonVO vo = new PersonVO("홍길동",34,"010-0000-0000");
        PersonVO vo1 = new PersonVO("김재혁", 40, "010-2222-2222");
        PersonVO vo2 = new PersonVO("김재", 30, "010-1111-2222");

        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo1.getName()+"\t"+vo1.getAge()+"\t"+vo1.getPhone());
        System.out.println(vo2.getName()+"\t"+vo2.getAge()+"\t"+vo2.getPhone());
    }
}
