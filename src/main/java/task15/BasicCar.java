package task15;

public class BasicCar extends Car{

    public BasicCar(){
        description = "Базовый автомобиль";
        cost = 50_000;
        weight = 800;
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
