package practice.task2;

/*
Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
чего нужно показать меню, в котором предложить пользователю набор пунктов:
1. Добавить элемент в список;
2. Удалить элемент из списка;
3. Показать содержимое списка;
4. Проверить есть ли значение в списке;
5. Заменить значение в списке.
В зависимости от выбора пользователя выполняется
действие, после чего меню отображается снова.
* */

import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> list;
    private static Menu menu = new Menu();
    private static Reader reader = new Reader();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите набор чисел через пробел:");
            list = reader.getNumbersList();
            if (list == null)
                System.out.println("Некорректный ввод\n");
            else
                break;
        }

        while (true) {
            menu.print();
            switch (reader.getMenuItem()) {
                case "1":
                    menu1Process();
                    break;
                case "2":
                    menu2Process();
                    break;
                case "3":
                    menu3Process();
                    break;
                case "4":
                    menu4Process();
                    break;
                case "5":
                    menu5Process();
                    break;
                default:
                    System.exit(1);
            }
        }
    }

    private static void menu1Process() {
        while (true) {
            System.out.println("Введите число: ");
            Integer n = reader.getInteger();
            if (n == null) {
                System.out.println("Некорректный ввод!");
            } else {
                list.add(n);
                break;
            }
        }
    }

    private static void menu2Process() {
        while (true) {
            System.out.println("Введите элемент, который нужно удалить " + list);
            Integer el = reader.getInteger();
            if (el == null) {
                System.out.println("Некорректный ввод!");
            } else {
                list.remove(el);
                break;
            }
        }
    }

    private static void menu3Process() {
        System.out.println(list + "\n");
    }

    private static void menu4Process() {
        while (true) {
            System.out.println("Введите значение, которое хотите проверить: ");
            Integer el = reader.getInteger();
            if (el == null) {
                System.out.println("Некорректный ввод!");
            } else {
                System.out.println(
                        (list.contains(el)
                                ? "Такое значение есть в списке с индексом " + list.indexOf(el) + "\n"
                                : "Такого значения нет\n"));
                break;
            }
        }
    }
    private static void menu5Process() {
        while (true) {
            System.out.println("Введите значение, которое хотите заменить: " + list);
            Integer el = reader.getInteger();
            if (el == null || !list.contains(el)) {
                System.out.println("Некорректный ввод или значение отсутствует!");
            } else {
                System.out.println("Введите новое значение: ");
                Integer newEl = reader.getInteger();
                if (newEl == null) {
                    System.out.println("Некорректный ввод");
                }
                else {
                    list.set(list.indexOf(el), newEl);
                    break;
                }
            }
        }
    }
}
