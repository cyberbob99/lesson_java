package task15;

import task15.decorator.AirConditioningDecorator;
import task15.decorator.LeatherInteriorDecorator;

public class Main {
    public static void main(String[] args) {

        Car car1 = new BasicCar();
        car1.printInfo();
        Car carAC = new AirConditioningDecorator(car1);
        carAC.printInfo();




    }
}
