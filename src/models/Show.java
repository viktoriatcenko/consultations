package models;

public class Show {

    //     * Класс Передача должен иметь поля:
    //     * * Название передачи
    //     *

    private String nameOfShow;

    public Show(String nameOfShow) {
        this.nameOfShow = nameOfShow;
    }

    public String getNameOfShow() {
        return nameOfShow;
    }

    public void setNameOfShow(String nameOfShow) {
        this.nameOfShow = nameOfShow;
    }
}
