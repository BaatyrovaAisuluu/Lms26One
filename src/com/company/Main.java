package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        Car деген класс тузунуз (Id, номер авто)
//        Дагы бир класс тузунуз, ал класста машинанын данныйлары
//    сакталат (год выпуска, модель, цена, цвет)
//        HashMap тузунуз ключ - машина, маани - машинанын данныйлары
//        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык
//        элементтерин консольго чыгарыныз.

        Map<Car, Car2> car = new HashMap<>();
        car.put(new Car(123, 2021),
                new Car2(678,"lexus",3000000,"bleu"));
        car.put(new Car(789, 3455),
                new Car2(567,"Step",2500000,"green"));
        for (Map.Entry cars : car.entrySet()) {
            System.out.println(cars.getKey() + " " + cars.getValue());
        }
    }
}
