package lesson_02;

import lesson_02.util.ReaderImpl;

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
        System.out.println("Вы зашли в программу для работы с котами!");
        String role = reader.checkRole();

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
            } else if (numberFromConsole == 3 && role.equals("ADMIN")) {
                scanner.nextLine();
                System.out.println("Введите имя кота!");
                Cat cat = new Cat();
                String name = scanner.nextLine();
                cat.setName(name);
                System.out.println("Введите породу кота!");
                String breed = scanner.nextLine();
                cat.setBreed(breed);
                System.out.println("Введите цвет кота!");
                String color = scanner.nextLine();
                cat.setColour(color);
                cat.setId((long) reader.countCats(reader.catsFromFile()) + 1);
                System.out.println("Кот был добавлен успешно!");
                reader.addCat(cat);
                reader.printCats();
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
