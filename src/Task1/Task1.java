package Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите набор чисел");
        Scanner scanner = new Scanner(System.in);
        String str  = scanner.nextLine();
        String[] numbs = str.split("\\s+");
        Set<String> uniqueNumbersSet = new HashSet<>();

        for (String number : numbs) {
            uniqueNumbersSet.add(number);
        }
        System.out.println("Уникальные: ");
        for (String n: uniqueNumbersSet) {
            System.out.println(n + " ");
        }
        }
}

