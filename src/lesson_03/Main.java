package lesson_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("���� �� ��������, ������� ����� ������"); // �� - �������������
        System.out.println("���� �� ����������, ������� �"); // �� ������������
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        if (s.equals("�")) {
            System.out.println("�� ������������");
        } else if (s.equals("������")) {
            System.out.println("�� - �������������");
        } else {
            System.out.println("�� ��������� ������! ����� ��� ���!");
        }



    }
}
