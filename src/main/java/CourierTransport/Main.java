package CourierTransport;

public class Main {

    public static void main(String[] args) {
        //принимаем новый вид заказа с базы (псевдокод)
       //String type = database.getTypeOfDeliver();

       //Deliver deliver = new Deliver();

        //заполняем транспорт в доставку

       //deliver.setCourierTransport(getCourierTransportByType(type));

        //доставляем
       //deliver.getCourierTransport().deliver();

    }

    public static CourierTransport getCourierTransportByType(String type) {
        switch (type) {
            case "CarDeliver":
                return new CarCreator().createTransport();
            case "TruckDeliver":
                return new TruckCreator().createTransport();


            default:
                throw new RuntimeException();
        }
    }
}
