package homework.task2;

/*
 * Создать класс Zoo.
 * В классе создать список, в который записать 8 животных через метод add(index, element).
 * Вывести список в консоль.
 * */

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0,"Bull");
        animals.add(1,"Bear");
        animals.add(2,"Crocodile");
        animals.add(3,"Wolf");
        animals.add(4,"Lion");
        animals.add(5,"Elephant");
        animals.add(6,"Horse");
        animals.add(7,"Leopard");

        System.out.println(animals);
    }
}
