package task21;

import java.util.List;

public interface Transformer <T, R> extends Processor <T> {

    R transform(T item);

    default List<R> transformAll(List<? extends T> items){
        return null;
    }
    @Override
    default void process(List<? extends T> items){

    }
}
