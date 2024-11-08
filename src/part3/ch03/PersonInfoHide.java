package part3.ch03;

import part3.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // 한사람의 회원 정보를 저장할 객체를 생성하세요.
        PersonVO vo = new PersonVO();
        vo.setName("홍길동");
        vo.setAge(50);

        vo.setPhone( "010-1111-1111");

        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
    }
}
