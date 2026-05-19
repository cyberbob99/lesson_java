package task20;

public class Main {

    public static void main(String[] args) {

    ElectricVehicle electricVehicle = new ElectricCar("1", 5, false);



    electricVehicle.start();
    electricVehicle.stop();
    electricVehicle.checkEngine();
    electricVehicle.start();
    electricVehicle.displayBatteryStatus();

        System.out.println("_________________");

    Bicycle bicycle = new Bicycle("2");
    bicycle.start();
    bicycle.stop();
        System.out.println(bicycle.getIdentifier());

        Vehicle v1 = new Bicycle("345");
        Vehicle v2 = new ElectricCar("6787", 5, false);

        v2.start();
        v1.start();





    }



}
