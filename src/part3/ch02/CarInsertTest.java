package part3.ch02;

import model.CarDAO;
import model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차 정보를 키보드로 부터 입력을 받아서 db에 저장을 하세요.
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

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();


    }

}
