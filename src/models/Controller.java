package models;

public interface Controller {
    //* ��������� ����� ������ ����� ������ ���� ������ �� ��������� � ��� ������:
    //     * * ����� ��� ������������ �� ������ (�.�. ���� ����� 5 - ��������� 5 �����, ����� 8 - ��������� 8 � �.�.)
    //     * * ����� ��� ����������������� ������������ ������ (�.�. �� ������ �� 2 ������, ����� ������ ����� ������,
    //     ������������� �� 3 � �.�.)
    //     * * ����� ��� ����������������� ������������ ����� (�.�. �� ������ �� 3 ������, ����� ������ ����� ������,
    //     ������������� �� 2 � �.�.)
    //     * * ���. ����� (��� ������) ����� ����� ���� ������������� ����� ���������� �������� (�.�. ���� �� ���� �� 5 ������,
    //     * � �� ����� ���� �� 8, �� ��� ������ ����� ������, �� ������ ����������� ��� �� 8 �����,
    //     ���� ������� ��� ��� ���, �� �� 5 �����)


    // 1
    //* * ����� ��� ������������ �� ������ (�.�. ���� ����� 5 - ��������� 5 �����, ����� 8 - ��������� 8 � �.�.)
    Channel switchToSpecificChannel(int numberOfChannel, Channel [] channels);

    // 2
    //* * ����� ��� ����������������� ������������ ������ (�.�. �� ������ �� 2 ������, ����� ������ ����� ������,
    //������������� �� 3 � �.�.)
    Channel switchToNextChannel(int numberOfCurrentChannel, Channel [] channels);

    // 3
    //* * ����� ��� ����������������� ������������ ����� (�.�. �� ������ �� 3 ������, ����� ������ ����� ������,
    //������������� �� 2 � �.�.)
    Channel switchToPreviousChannel(int numberOfCurrentChannel, Channel [] channels);

    // optional
    //     * * ���. ����� (��� ������) ����� ����� ���� ������������� ����� ���������� �������� (�.�. ���� �� ���� �� 5 ������,
    //     * � �� ����� ���� �� 8, �� ��� ������ ����� ������, �� ������ ����������� ��� �� 8 �����,
    //     ���� ������� ��� ��� ���, �� �� 5 �����)
    Channel switchToPreviousChannels(int numberOfChannel);
}
