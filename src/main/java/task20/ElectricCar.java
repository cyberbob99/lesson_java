package task20;

public class ElectricCar implements ElectricVehicle{

    private String identifier; //уникальный идентификатор автомобиля
    private int batteryLevel; //уровень заряда батареи (0-100)
    private boolean isRunning; //состояние двигателя (запущен/остановлен)

    public ElectricCar(String identifier, int batteryLevel, boolean isRunning) {
        this.identifier = identifier;
        this.batteryLevel = batteryLevel;
        this.isRunning = isRunning;
    }
    public ElectricCar(String identifier, boolean isRunning) {
        this.identifier = identifier;
        this.batteryLevel = 50;
        this.isRunning = isRunning;
    }



    @Override
    public void charge() {

    }

    @Override
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public void displayBatteryStatus() {
        System.out.println("Текущий уровень заряда" + this.batteryLevel + " %");
    }

    @Override
    public void refuel() {
        charge();
    }

    @Override
    public double getFuelLevel() {
        return getBatteryLevel();
    }

    @Override
    public void checkEngine() {
        if(isRunning && batteryLevel > 0) {
            System.out.println("Номер автомобиля: " + this.identifier);
            System.out.println("Текущий уровень заряда" + this.batteryLevel + " %");
            System.out.println("Все работает");
        }else {
            System.out.println("Номер автомобиля: " + this.identifier);
            System.out.println("Двигатель не запущен или уровень заряда недостаточный");
        }


    }

    @Override
    public void start() {
        if(!isRunning && batteryLevel > 0) {
            isRunning = true;
            System.out.println("Запуск двигателя... Уровень заряда:" + batteryLevel + " %");
        }else {
            System.out.println("Двигатель запущен");
        }

    }

    @Override
    public void stop() {
        if(isRunning){
            isRunning = false;
            System.out.println("Двигатель остановлен");
        }

    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }
}
