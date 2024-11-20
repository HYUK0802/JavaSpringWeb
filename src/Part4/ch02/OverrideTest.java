package Part4.ch02;

import model.Animal;
import model.Cat;
import model.Dog;

public class OverrideTest {
    public static void main(String[] args) {

        // Upcasting(업케스팅)
        Animal ani = new Dog();
        ani.eat(); // Animal --(동적바인딩)--> Dog

        ani = new Cat();
        ani.eat();
    }
}
