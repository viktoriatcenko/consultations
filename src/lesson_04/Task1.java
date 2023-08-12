package lesson_04;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        /**
         * 1. Создай список чисел.
         * 2. Добавь в него 7 различных чисел.
         * 3. Выведи его размер на экран.
         * 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
         * */

//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("s");
//        list.add("st");
//        list.add("str");
//        list.add("stri");
//        list.add("strin");
//
//        System.out.println(list.size());
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);

        System.out.println(list.size());


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
