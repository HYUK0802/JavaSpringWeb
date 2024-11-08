package part3.ch03;

import part3.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // setter, getter 메서드를 통해 personVO객체에 이름, 나이, 전화번호를 저장하고 출력하세여
        PersonVO vo1 = new PersonVO();
        vo1.setName("홍길동");
        vo1.setAge(50);
        vo1.setPhone("010-1111-1111");

        System.out.println(vo1.getName() + "\t" + vo1.getAge() + "\t" + vo1.getPhone());

    }


}
