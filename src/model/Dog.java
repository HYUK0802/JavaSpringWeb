package model;

public class Dog extends Animal{
    public Dog(){

        super(); // 생략 되있음 new Animal();
    }

    // 재정의
    public void eat(){
        System.out.println("개처럼 먹다.");
    }


}
