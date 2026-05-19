package task19;

public class Main {

    public static void main(String[] args)  {
        EmailMessage emailMessage = new EmailMessage("example@gmail.com", "example", "example");
        SmsMessage smsMessage = new SmsMessage("+79653043345", "example");

        EmailSender emailSender = new EmailSender();
        SmsSender smsSender = new SmsSender();

        NotificationService notificationService = new NotificationService();
        notificationService.registerSender(emailSender);
        notificationService.registerSender(smsSender);




         //   notificationService.sendBroadcast(smsMessage);






    }


}
