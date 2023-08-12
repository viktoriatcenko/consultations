package lesson_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /**
         1. Создай список строк в методе main.
         2. Добавь в него 5 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
         3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
         * */

        int [] arr = new int[5];

        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String fromConsole = scanner.nextLine();
            list.add(0, fromConsole);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
