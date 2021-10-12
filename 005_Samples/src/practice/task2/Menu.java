package practice.task2;

import java.util.ArrayList;

public class Menu {
    private String[] menu = {
            "Введите действие:",
            "1. Добавить элемент в список",
            "2. Удалить элемент из списка",
            "3. Показать содержимое списка",
            "4. Проверить есть ли значение в списке",
            "5. Заменить значение в списке"
    };

    public void print() {
        for (String item : menu) {
            System.out.println(item);
        }
    }
}
