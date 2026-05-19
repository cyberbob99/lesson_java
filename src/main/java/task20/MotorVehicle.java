package task20;

public interface MotorVehicle extends Vehicle {

    void refuel(); //заправка топливом или зарядка
    double getFuelLevel(); //возвращает уровень топлива/заряда (в процентах)
    void checkEngine(); //проверка состояния двигателя



}
