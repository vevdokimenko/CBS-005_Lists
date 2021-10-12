package practice.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Светлана Ивановна");
        teachers.add("Екатерина Петровна");
        teachers.add("Валентина Николаевна");
        teachers.add("Галина Степановна");
        teachers.add("Татьяна Ивановна");

        System.out.println("Индекс самого лучшего учителя: " + teachers.indexOf("Галина Степановна"));
        System.out.println("Индекс самого не очень: " + teachers.indexOf("Екатерина Петровна"));
        System.out.println(teachers);
    }
}
