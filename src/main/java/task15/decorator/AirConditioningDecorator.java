package task15.decorator;

import task15.Car;

public class AirConditioningDecorator extends DecoratorCar {

    Car car;

    public AirConditioningDecorator(Car car) {
        this.car = car;
    }

    @Override
    public int getCost() {
        return car.getCost() + 5000;
    }

    @Override
    public int getWeight() {
        return car.getWeight() + 20;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " кондиционер";
    }

    @Override
    public void printInfo() {
        System.out.println(getDescription());
        System.out.println(getCost());
        System.out.println(getWeight());
    }
}
