package part3.ch01;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한 사람의 데이터를 저장할 변수를 선언하세요.

        // 인스턴스를 만드는 과정
        Person p = new Person();
        p.name = "김재혁";
        p.age = 27;
        p.phone = "01000000000";
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.phone);
        p.play();
        p.walk();
        p.eat();


        Person p1 = new Person();
        p1.name = "갬지콩";
        p1.age = 25;
        p1.phone = "010-1234-5678";
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.phone);
        p1.play();
        p1.walk();
        p1.eat();
    }
}
