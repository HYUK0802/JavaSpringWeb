package part3.ch02;

import model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // 자동차의 정보를 키보드로부터 입력 받아서 다른 메서드로 이동해야 되는 경우를 생각해보자
        Scanner sc = new Scanner(System.in);
        System.out.print("자동차일련번호:");
        int carSn=sc.nextInt();

        sc.nextLine();

        System.out.print("자동차이름:");
        String carName=sc.nextLine();

        System.out.print("자동차가격:");
        int carPrice=sc.nextInt();

        sc.nextLine();

        System.out.print("자동차소유자:");
        String carOwner=sc.nextLine();

        System.out.print("자동차년식:");
        int carYear=sc.nextInt();

        sc.nextLine();

        System.out.print("자동차타입:");
        String carType=sc.nextLine();

//        carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
    }


    // 매개변수로 자동차의 정보를 받아서 출력하는 메서드를 정의하세요.
    public static void carInfoPrint(CarDTO car) {
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);

    }
}
