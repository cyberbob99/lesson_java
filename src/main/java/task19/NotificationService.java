package task19;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    List<Sender> senders = new ArrayList<>();

    void registerSender(Sender sender){
        senders.add(sender);
    }

//    void sendBroadcast(Message message) throws InvalidMessageTypeException {
//        for (Sender sender : senders) {
//           try{
//               sender.send(message);
//
//           }catch (InvalidMessageTypeException e){
//               throw new InvalidMessageTypeException();
//           }
//
//        }
//    }

}
