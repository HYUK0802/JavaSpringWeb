package Part4.ch02;

import model.Animal;
import model.Cat;
import model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Dog객체를 사용해보자
        Animal d = new Dog(); // upcasting (부모가 자식을 가리킨다)
        d.eat();

        d = new Cat();
        d.eat();



    }
}
