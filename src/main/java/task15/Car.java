package task15;

public abstract class Car {
    String description;
    int cost;
    int weight;



    public String getDescription(){
        return description;
    }
    public abstract int getCost();

    public abstract int getWeight();

    public void printInfo(){
        System.out.println(description);
        System.out.println(cost);
        System.out.println(weight);

    }

}
