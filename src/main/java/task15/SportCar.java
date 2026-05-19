package task15;

public class SportCar extends Car {

    public SportCar(){
        description = "Спортивный автомобиль";
        cost = 100_000;
        weight = 500;
    }


    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
