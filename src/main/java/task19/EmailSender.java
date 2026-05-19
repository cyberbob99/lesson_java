package task19;

public class EmailSender implements Sender{

    @Override
    public void send(Message message) throws InvalidMessageTypeException {

        if(message instanceof EmailMessage) {
            System.out.printf("Отправка EMAIL на адрес [%s]: Тема: [%s], Текст: [%s] \n",
                    message.getRecipient(),
                    ((EmailMessage) message).subject,
                    message.getContent());
        } else {
            throw new InvalidMessageTypeException();
        }

    }
}
