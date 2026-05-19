package sream1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static sream1.Selector.initData;
import static sream1.Selector.owners;

// Осталось дописать код метода main, в котором вначале вызовем метод initData(),
// который заполнит данными список владельцев животных в клубе, а потом выберет имена рыжих котов,
// отсортированных по возрасту в убывающем порядке.
//
//Вначале рассмотрим код, не использующий стримы для решения этой задачи:

public class Main {
    public static void main(String[] args) {
        initData();

        List<String> findNames = new ArrayList<>();
        List<Cat> findCats = new ArrayList<>();
        for (Owner owner : owners) {
            for (Animal pet : owner.getPets()) {
                if (Cat.class.equals(pet.getClass()) && Color.FOXY == pet.getColor()) {
                    findCats.add((Cat) pet);
                }
            }
        }

        Collections.sort(findCats, new Comparator<Cat>() {
            public int compare(Cat o1, Cat o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        for (Cat cat : findCats) {
            findNames.add(cat.getName());
        }

        findNames.forEach(System.out::println);
    }
    



    //А теперь давайте посмотрим на альтернативный вариант:

   /*public static void main(String[] args) {
        initData();

        final List<String> findNames = owners.stream()

                .flatMap(owner -> owner.getPets().stream())
                .filter(pet -> Cat.class.equals(pet.getClass()))
                .filter(cat -> Color.FOXY == cat.getColor())
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .map(Animal::getName)
                .collect(Collectors.toList());

        findNames.forEach(System.out::println);
    }*/



}


