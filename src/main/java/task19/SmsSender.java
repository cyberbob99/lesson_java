package task19;

public class SmsSender implements Sender{


    @Override
    public void send(Message message) throws InvalidMessageTypeException {

        if(message instanceof SmsMessage) {
            System.out.printf("Отправка SMS на номер [%s]: [%s] \n", message.getRecipient(), message.getContent());
        }else {
            throw new InvalidMessageTypeException();
        }

    }
}
