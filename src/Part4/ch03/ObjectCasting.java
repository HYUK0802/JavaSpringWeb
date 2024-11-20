package Part4.ch03;

import model.Animal;
import model.Cat;
import model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal --> Dog, Cat
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat(); // 업캐스팅
        ani.eat();
        ((Cat)ani).night(); // 다운캐스팅

    }
}
