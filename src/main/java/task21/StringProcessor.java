package task21;

import java.util.List;

public class StringProcessor implements Filter <String>{

    int minLength; //— минимальная длина строки для прохождения фильтра
    String prefix; //— префикс, с которого должна начинаться строка

    public StringProcessor(int minLength, String prefix) {
        this.minLength = minLength;
        this.prefix = prefix;
    }

    public StringProcessor(int minLength) {
        this.minLength = minLength;
    }

    public StringProcessor(String prefix) {
        this.prefix = prefix;
    }

    public StringProcessor() {

    }


    public boolean test(String item) {
        return (item != null && item.length() >= minLength && item.startsWith(prefix));
    }



    @Override
    public void process(List<? extends String> items) {
        Filter.super.process(items);
    }




}
