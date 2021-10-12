package practice.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    private Scanner sc = new Scanner(System.in);
    private String[] numbersArray;
    private ArrayList<Integer> numbersList = new ArrayList<>();
    private String input;

    public ArrayList<Integer> getNumbersList() {
        input = sc.nextLine();
        numbersArray = input.split(" ");
        for (String item : numbersArray) {
            if (item.matches("[-+]?\\d+"))
                numbersList.add(Integer.parseInt(item));
            else
                return null;
        }
        return numbersList;
    }

    public String getMenuItem() {
        return sc.nextLine();
    }

    public Integer getInteger() {
        String strNumber = sc.nextLine();
        if (strNumber.matches("[-+]?\\d+"))
            return Integer.parseInt(strNumber);
        return null;
    }
}
