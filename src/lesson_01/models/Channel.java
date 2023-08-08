package lesson_01.models;

public class Channel {

    // * ����� ����� ������ ����� ����:
    //     * * �������� ������
    //     * * ������ �������

    private String nameOfChannel;
    private Show [] shows;

    public Channel(String nameOfChannel, Show[] shows) {
        this.nameOfChannel = nameOfChannel;
        this.shows = shows;
    }

    public Show[] getShows() {
        return shows;
    }

    public void setShows(Show[] shows) {
        this.shows = shows;
    }

    public String getNameOfChannel() {
        return nameOfChannel;
    }

    public void setNameOfChannel(String nameOfChannel) {
        this.nameOfChannel = nameOfChannel;
    }
}
