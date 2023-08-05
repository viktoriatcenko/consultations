package models;

public class ControllerImpl implements Controller {

    @Override
    public Channel switchToSpecificChannel(int numberOfChannel, Channel [] channels) {
        printChannelAndShow(channels, numberOfChannel);
        return channels[numberOfChannel];
    }

    @Override
    public Channel switchToNextChannel(int numberOfCurrentChannel, Channel [] channels) {
        int nextNum = numberOfCurrentChannel + 1;
        printChannelAndShow(channels, nextNum);
        return channels[nextNum];
    }

    @Override
    public Channel switchToPreviousChannel(int numberOfCurrentChannel, Channel [] channels) {
        int previousNum = numberOfCurrentChannel - 1;
        printChannelAndShow(channels, previousNum);
        return channels[previousNum];
    }


    @Override
    public Channel switchToPreviousChannels(int numberOfChannel) {

        // TODO
        return null;
    }


    public void printChannelAndShow(Channel [] channels, int numberOfChannel) {
        System.out.println(channels[numberOfChannel - 1].getNameOfChannel());
        System.out.println(channels[numberOfChannel - 1].getShows()[0].getNameOfShow());
    }
}
