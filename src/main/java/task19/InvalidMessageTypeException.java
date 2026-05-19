package task19;

public class InvalidMessageTypeException extends Throwable {

    @Override
    public String getMessage() {
        return "Неправильный тип Мессенджера";
    }
}
