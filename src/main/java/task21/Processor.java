package task21;

import java.time.LocalTime;
import java.util.List;

public interface Processor <T>{

    void process(List<? extends T> items);

    default void processAndDisplay(List<? extends T> items){
        process(items);

    }

    default void log(String message){
        System.out.println(LocalTime.now() + " - " + message);

    }
}
