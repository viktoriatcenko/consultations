import lesson_01.models.Channel;
import lesson_01.models.ControllerImpl;
import lesson_01.models.Show;
import lesson_01.models.Televisor;

import java.util.Scanner;

public class Main {
        /**
     *
     * Телевизор
     *
     * Нужно написать приложение "Телевизор"
     * Создать классы:
     *
     * * Класс Телевизор
     * * Интерфейс Пульт (Сделать несколько реализаций этого интерфейса)
     * * Класс Канал
     * * Класс Передача
     *
     * Класс Телевизор должен иметь поля:
     * * Массив каналов
     *
     * Интерфейс Пульт должен иметь внутри себя ссылку на Телевизор и три метода:
     * * Метод для переключения по цифрам (Т.е. ввел цифру 5 - включился 5 канал, цифру 8 - включился 8 и т.д.)
     * * Метод для последовательного переключения вперед (Т.е. вы сейчас на 2 канале, после вызова этого метода, пеерключились на 3 и т.д.)
     * * Метод для последовательного переключения назад (Т.е. вы сейчас на 3 канале, после вызова этого метода, пеерключились на 2 и т.д.)
     * * Доп. метод (доп задача) чтобы можно было переключаться между последними каналами (Т.е. если вы были на 5 канале,
     * а до этого были на 8, то при вызове этого метода, он должен переключить нас на 8 канал, если вызвать его еще раз, то на 5 канал)
     *
     * Класс Канал должен иметь поля:
     * * Название канала
     * * Массив передач
     *
     * Класс Передача должен иметь поля:
     * * Название передачи
     *
     *
     * Пример работы приложения:\
     * При включении телевизора должен выводиться рандомный канал с передачей
     * Пример:
     * ***
     * Первый канал
     *
     * Вести
     * ***
     * После этого, я могу либо переключать каналы последовательно, либо же по цифрам\
     * Ввожу 5
     * ***
     * Рен-ТВ
     * История оружия
     * ***
     * Ввожу 10
     * ***
     * ТНТ\
     * Битва экстрасенсов
     * ***
     * Ввел 0, идет последовательное переключение вперед
     * Ввел -1 идет последовательное переключение назад
     * */

        public static void main(String[] args) {
            Show fightOfExtransories = new Show("Битва экстрасенсов");
            Show fieldOfDreams = new Show("Поле чудес");

            Show [] showsOfFirstChannel = new Show[100];

            showsOfFirstChannel[0] = fightOfExtransories;
            showsOfFirstChannel[1] = fieldOfDreams;

            Channel firstChannel = new Channel("Первый канал", showsOfFirstChannel);

            Show dom2 = new Show("DOm-2");
            Show comedyClub = new Show("ComedyClub");

            Show [] showsOfSecondChannel = new Show[100];

            showsOfSecondChannel[0] = dom2;
            showsOfSecondChannel[1] = comedyClub;

            Channel secondChannel = new Channel("Второй канал", showsOfSecondChannel);

            Show lost = new Show("Остаться в живых");
            Show getMarrired = new Show("Давай поженимся");

            Show [] showsOfThirdChannel = new Show[100];

            showsOfThirdChannel[0] = lost;
            showsOfThirdChannel[1] = getMarrired;

            Channel thirdChannel = new Channel("Третий канал", showsOfThirdChannel);

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