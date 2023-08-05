package models;

import java.util.Random;

public class Televisor {


    // * ����� ��������� ������ ����� ����:
    //     * * ������ �������


    private Channel [] channels;

    public Televisor(Channel[] channels) {
        this.channels = channels;
    }

    public Channel[] getChannels() {
        return channels;
    }

    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }

    public int on() {
        Random random = new Random();
        // ��������� ����� ��� ���������� ������
        int randomCh = random.nextInt(0, countChannel(channels));
        Channel randomChannel = channels[randomCh];


        // ��������� ����� ��� ���������� ���
        int randomSh = random.nextInt(0, countShows(randomChannel.getShows()));
        Show randomShow = randomChannel.getShows()[randomSh];

        System.out.println(randomChannel.getNameOfChannel());

        System.out.println(randomShow.getNameOfShow());
        return randomCh;
    }

    public int countChannel(Channel [] channels) {
        int count = 0;

        for (Channel c: channels) {
            if (c != null) count++;
        }
        return count;
    }

    public int countShows(Show [] shows) {
        int count = 0;

        for (Show c: shows) {
            if (c != null) count++;
        }
        return count;
    }

}
