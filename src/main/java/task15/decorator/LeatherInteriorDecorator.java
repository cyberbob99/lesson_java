package task15.decorator;

import task15.Car;

public class LeatherInteriorDecorator extends DecoratorCar {
    Car car;
    String description = " Кожанный салон";
    int cost = 10000;
    int weight = 10;

    public LeatherInteriorDecorator(Car car) {
        this.car = car;

    }
    @Override
    public int getCost() {
        return car.getCost() + cost;
    }

    @Override
    public int getWeight() {
        return car.getWeight() + weight;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + description;
    }

    @Override
    public void printInfo() {
        System.out.println(getDescription());
        System.out.println(getCost());
        System.out.println(getWeight());
    }
}
