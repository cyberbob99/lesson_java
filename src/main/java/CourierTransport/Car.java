package CourierTransport;

public class Car implements CourierTransport {

    @Override
    public void deliver() {
        System.out.println("The parcel is delivered by car ");
    }
}
