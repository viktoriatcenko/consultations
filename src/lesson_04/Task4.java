package lesson_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /**
         1. ������ ������ ����� � ������ main.
         2. ������ � ���� 5 ������� � ����������, �� ������ ��������� �� � ����� ������, � � ������.
         3. ��������� ���� ������ ���������� �� �����, ������ �������� � ����� ������.
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
