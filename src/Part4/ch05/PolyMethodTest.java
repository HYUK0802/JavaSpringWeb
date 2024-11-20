package Part4.ch05;

import model.Animal;
import model.Cat;
import model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d= new Dog();
        display(d);
        Cat c = new Cat();
        display(c);

    }


    private static void display(Animal ani) {
        ani.eat();
        // Cat타입으로 받은 경우에만 실행
        if (ani instanceof Cat) {
            ((Cat)ani).night();

        }
    }
}
