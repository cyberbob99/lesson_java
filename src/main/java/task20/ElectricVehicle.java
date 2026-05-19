package task20;

public interface ElectricVehicle extends MotorVehicle{

    void charge(); //зарядить аккумулятор
    int getBatteryLevel(); //возвращает уровень заряда батареи (0-100%)
    void displayBatteryStatus(); //отображает статус батареи
}
