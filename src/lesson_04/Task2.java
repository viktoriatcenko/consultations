package lesson_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /**
         1. Создай list строк.
         2. Считай с консоли 5 строк и добавь в list.
         3. Используя цикл, найди самую длинную строку в list. // length()
         4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
         * */


        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String fromConsole = scanner.nextLine();
            list.add(fromConsole);
        }

        int maxCount = 0;

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).length() > maxCount) {
                maxCount = list.get(i).length();
            }
        }



        for (int i = 0; i < list.size(); i++) {
            if (maxCount == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }




    }
}
