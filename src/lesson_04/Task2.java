package lesson_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /**
         1. ������ list �����.
         2. ������ � ������� 5 ����� � ������ � list.
         3. ��������� ����, ����� ����� ������� ������ � list. // length()
         4. ������ ��������� ������ �� �����. ���� ����� ����� ���������, ������ ������ � ����� ������.
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
