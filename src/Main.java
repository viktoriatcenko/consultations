import lesson_01.models.Channel;
import lesson_01.models.ControllerImpl;
import lesson_01.models.Show;
import lesson_01.models.Televisor;

import java.util.Scanner;

public class Main {
        /**
     *
     * ���������
     *
     * ����� �������� ���������� "���������"
     * ������� ������:
     *
     * * ����� ���������
     * * ��������� ����� (������� ��������� ���������� ����� ����������)
     * * ����� �����
     * * ����� ��������
     *
     * ����� ��������� ������ ����� ����:
     * * ������ �������
     *
     * ��������� ����� ������ ����� ������ ���� ������ �� ��������� � ��� ������:
     * * ����� ��� ������������ �� ������ (�.�. ���� ����� 5 - ��������� 5 �����, ����� 8 - ��������� 8 � �.�.)
     * * ����� ��� ����������������� ������������ ������ (�.�. �� ������ �� 2 ������, ����� ������ ����� ������, ������������� �� 3 � �.�.)
     * * ����� ��� ����������������� ������������ ����� (�.�. �� ������ �� 3 ������, ����� ������ ����� ������, ������������� �� 2 � �.�.)
     * * ���. ����� (��� ������) ����� ����� ���� ������������� ����� ���������� �������� (�.�. ���� �� ���� �� 5 ������,
     * � �� ����� ���� �� 8, �� ��� ������ ����� ������, �� ������ ����������� ��� �� 8 �����, ���� ������� ��� ��� ���, �� �� 5 �����)
     *
     * ����� ����� ������ ����� ����:
     * * �������� ������
     * * ������ �������
     *
     * ����� �������� ������ ����� ����:
     * * �������� ��������
     *
     *
     * ������ ������ ����������:\
     * ��� ��������� ���������� ������ ���������� ��������� ����� � ���������
     * ������:
     * ***
     * ������ �����
     *
     * �����
     * ***
     * ����� �����, � ���� ���� ����������� ������ ���������������, ���� �� �� ������\
     * ����� 5
     * ***
     * ���-��
     * ������� ������
     * ***
     * ����� 10
     * ***
     * ���\
     * ����� ������������
     * ***
     * ���� 0, ���� ���������������� ������������ ������
     * ���� -1 ���� ���������������� ������������ �����
     * */

        public static void main(String[] args) {
            Show fightOfExtransories = new Show("����� ������������");
            Show fieldOfDreams = new Show("���� �����");

            Show [] showsOfFirstChannel = new Show[100];

            showsOfFirstChannel[0] = fightOfExtransories;
            showsOfFirstChannel[1] = fieldOfDreams;

            Channel firstChannel = new Channel("������ �����", showsOfFirstChannel);

            Show dom2 = new Show("DOm-2");
            Show comedyClub = new Show("ComedyClub");

            Show [] showsOfSecondChannel = new Show[100];

            showsOfSecondChannel[0] = dom2;
            showsOfSecondChannel[1] = comedyClub;

            Channel secondChannel = new Channel("������ �����", showsOfSecondChannel);

            Show lost = new Show("�������� � �����");
            Show getMarrired = new Show("����� ���������");

            Show [] showsOfThirdChannel = new Show[100];

            showsOfThirdChannel[0] = lost;
            showsOfThirdChannel[1] = getMarrired;

            Channel thirdChannel = new Channel("������ �����", showsOfThirdChannel);

            Channel [] channels = new Channel[100];
            channels[0] = firstChannel;
            channels[1] = secondChannel;
            channels[2] = thirdChannel;

            Televisor tv = new Televisor(channels);

            int curentChannelIndex = tv.on() + 1;

            ControllerImpl controller = new ControllerImpl();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                int numberOfChannel = scanner.nextInt();

                if (numberOfChannel == 0 ) {
                    controller.switchToNextChannel(curentChannelIndex - 1, channels);
                } else if (numberOfChannel == -1) {
                    controller.switchToPreviousChannel(curentChannelIndex - 1, channels);
                } else {
                    controller.switchToSpecificChannel(numberOfChannel, channels);
                }
                curentChannelIndex = numberOfChannel;

                if (numberOfChannel == 100) return;
            }


            


        }




}