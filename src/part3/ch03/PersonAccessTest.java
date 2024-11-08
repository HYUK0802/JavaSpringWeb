package part3.ch03;

import part3.ch01.Person;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.
        Person p = new Person();
        p.name = "홍길동";
        p.age = 50;
        p.phone = "010-0000-0000";
        System.out.println(p.name+p.age+p.phone);
    }
}
