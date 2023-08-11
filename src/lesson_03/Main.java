package lesson_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Если вы продавец, введите слово пароль"); // вы - администратор
        System.out.println("Если вы покупатель, введите П"); // вы пользователь
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        if (s.equals("П")) {
            System.out.println("вы пользователь");
        } else if (s.equals("пароль")) {
            System.out.println("вы - администратор");
        } else {
            System.out.println("Вы совершили ошибку! Вводи еще раз!");
        }



    }
}
