package CourierTransport;

public class Truck implements CourierTransport {

    @Override
    public void deliver() {
        System.out.println("Cargo is delivered by truck");
    }
}
