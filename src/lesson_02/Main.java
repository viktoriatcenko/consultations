package lesson_02;

import lesson_02.util.ReaderImpl;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /**
         * ����� ������� ����� Car. � ������ Car ������ ���� ����:
         *
         * ID (������: 1 ��� 2 ��� 3 � �.�.)
         * �����
         * ������
         * ����
         * �������� ���������
         *
         * ��������� ������ �����:
         *
         * �������� ��� ��������� ���������� � �� �����������
         * �������� ������ �� �� ID (���� ��� � �������)
         * ��������� ����� ������
         * ������������� ������
         * ������� ������
         * ��������� ������ ����� �������� � �������������. �.�. ������ ���� ����������� ������ � �������� (Scanner)
         * */


        ReaderImpl reader = new ReaderImpl();
        reader.printInstruction();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int numberFromConsole = scanner.nextInt();
            if (numberFromConsole == 1) {
                reader.printCats();
            } else if (numberFromConsole == 2) {
                System.out.println("������� id ������������� ��� ����!");
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
