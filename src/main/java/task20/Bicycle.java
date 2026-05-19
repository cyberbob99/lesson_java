package task20;

public class Bicycle implements Vehicle{

    private String identifier; //уникальный идентификатор велосипеда
    private boolean isMoving; //состояние движения

    public Bicycle(String identifier){
        this.identifier = identifier;
        this.isMoving = false;
    }

    @Override
    public void start() {
        if (!isMoving){
            isMoving = true;
            System.out.println("Поехали");
        }

    }

    @Override
    public void stop() {
        if (isMoving){
            isMoving = false;
            System.out.println("Остановились");
        }
    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }
}
