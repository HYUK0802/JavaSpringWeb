package Part4.ch02;

import model.Cat;
import model.Dog;

public class DogCatTest {
    public static void main(String[] args) {

        // Dog 객체를 생성하고 eat()동작을 구동해보자.
        Dog d = new Dog();
        d.eat();

        // Cat 객체를 생성하고 동작을 구동해보자
        Cat c = new Cat();
        c.eat();
        c.night();
    }



}
