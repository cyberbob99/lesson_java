package task21;

import java.util.List;

public interface Filter <T> extends Processor<T>{

    boolean test(T item);


    default List<T> filter(List<? extends T> items){
        return null;
    }

    default void process(List<? extends T> items){


    }

}
