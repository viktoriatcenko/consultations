package lesson_02;

import lesson_02.util.ReaderImpl;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /**
         * Нужно создать класс Car. У класса Car должны быть поля:
         *
         * ID (Пример: 1 или 2 или 3 и т.д.)
         * Марка
         * Модель
         * Цвет
         * Мощность двигателя
         *
         * Программа должна уметь:
         *
         * Выводить все имеющиеся автомобили с их информацией
         * Находить машину по ее ID (если она в наличии)
         * Добавлять новые машины
         * Редактировать машину
         * Удалять машину
         * Программа должна уметь работать с пользователем. Т.е. должна быть реализована работа с консолью (Scanner)
         * */


        ReaderImpl reader = new ReaderImpl();
        reader.printInstruction();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int numberFromConsole = scanner.nextInt();
            if (numberFromConsole == 1) {
                reader.printCats();
            } else if (numberFromConsole == 2) {
                System.out.println("ВВедите id интересуемого вас кота!");
                numberFromConsole = scanner.nextInt();
                Cat cat = reader.findCat((long) numberFromConsole);
                System.out.println(cat);
            }

            reader.printInstruction();

            if (scanner.nextInt() == 0) return;
        }






//        reader.printCats();
//        System.out.println(reader.findCat(2L));
//        Cat cat = new Cat(3L, "New Cat", "New Breed", "New Color");
//
//        Cat[] catsWithNewCat = reader.addCat(cat);
//        System.out.println(Arrays.toString(catsWithNewCat));
    }
}
