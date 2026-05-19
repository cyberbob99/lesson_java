package task19;

public class SmsMessage implements Message{

    String phoneNumber;
    String content;

    public SmsMessage(String phoneNumber, String content) {
        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getRecipient() {
        return phoneNumber;
    }
}
