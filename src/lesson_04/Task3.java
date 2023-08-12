package lesson_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /**
         * 1. Создай список строк.
         * 2. Считай с клавиатуры 5 строк и добавь в список.
         * 3. Используя цикл, найди самую короткую строку в списке.
         * 4. Выведи найденную строку на экран.
         * 5. Если таких строк несколько, выведи каждую с новой строки.
         * */

        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String fromConsole = scanner.nextLine();
            list.add(0, fromConsole);
        }

        int min = 100;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (min == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
    }
}
