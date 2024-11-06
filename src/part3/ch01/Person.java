package part3.ch01;
// 객체(object) = 상태정보(멤버변수) + 행위정보(멤버메서드)
public class Person {
    public String name;
    public int age;
    public String phone;

    // 기본 생성자 메서드
    public Person() {

    }

    public void play() {
        System.out.println(name + "이 운동을한다.");
    }
    public void eat() {
        System.out.println(name + "이 음식을 먹다");
    }
    public void walk() {
        System.out.println(name + "이 걷다.");
    }
}
