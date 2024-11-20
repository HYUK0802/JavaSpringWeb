package part3.ch02;

import model.CarDTO;
import model.CarUtility;


public class CarUtilityTest {
    public static void main(String[] args) {
        // Car 정보를 출력하는 동작을 가지고 있는 utility클래스를 설계하세요
        int carSn=1110;
        String carName = "BMW x6";
        int carPrice = 16000000;
        String carOwner = "김재혁";
        int carYear = 2024;
        String carType = "6";

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        //carPrint(car);
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car  );
    }



}
