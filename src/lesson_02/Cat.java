package lesson_02;

public class Cat {
    private Long id;
    private String name;
    private String breed;
    private String colour;

    public Cat() {
    }

    public Cat(Long id, String name, String breed, String colour) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.colour = colour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " +
                " id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ' ';
    }
}
