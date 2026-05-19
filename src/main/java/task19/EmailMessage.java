package task19;

public class EmailMessage implements Message{

    String email; // — адрес получателя.
    String content; // — текст письма.
    String subject; // — тема письма (дополнительное поле, специфичное для email).

    public EmailMessage(String email, String content, String subject) {
        this.email = email;
        this.content = content;
        this.subject = subject;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getRecipient() {
        return email;
    }
}
