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
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void printMenu() {
        System.out.println("1. Добавить элемент в список;");
        System.out.println("2. Удалить элемент из списка;");
        System.out.println("3. Показать содержимое списка;");
        System.out.println("4. Проверить есть ли значение в списке;");
        System.out.println("5. Заменить значение в списке.");
    }

    public static void main(String[] args) {
        System.out.println("Введите набор чисел через пробел:");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        ArrayList<Integer> inputs = new ArrayList<>();
        String[] arr = input.split(" ");

        for (String item : arr) {
            if (item.matches("[-+]?\\d+"))
                inputs.add(Integer.parseInt(item));
            else
                System.out.println("Вы ввели не число.");
        }

        while (true) {
            printMenu();
            input = sc.nextLine();
            if (input.matches("[-+]?\\d+")){
                switch (Integer.parseInt(input)) {
                    case 1: {
                        System.out.println("Введите число: ");
                        input = sc.nextLine();
                        inputs.add(Integer.parseInt(input));
                    }
                        break;
                    case 2: {
                        System.out.println("Введите номер элемента, который нужно удалить: ");
                        input = sc.nextLine();
                        int index = Integer.parseInt(input);
                        inputs.remove(index);
                    }
                        break;
                    case 3: {
                        System.out.println(inputs);
                    }
                        break;
                    case 4: {
                        System.out.println("Введите значение, которое хотите проверить: ");
                        input = sc.nextLine();
                        System.out.println(inputs.contains(Integer.parseInt(input)));
                    }
                    break;
                    case 5: {
                        System.out.println("Введите значение, которое хотите заменить: ");
                        input = sc.nextLine();
                        if (inputs.contains(Integer.parseInt(input))) {
                            System.out.println("Введите новое значение: ");
                            inputs.set(Integer.parseInt(input), Integer.parseInt(sc.nextLine()));
                        }
                    }
                    break;
                    default: System.exit(1);
                }
            } else {
                printMenu();
            }
        }


    }
}
