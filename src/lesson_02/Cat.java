package lesson_02;

import java.util.Objects;

public class Cat extends Object {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (!Objects.equals(id, cat.id)) return false;
        if (!Objects.equals(name, cat.name)) return false;
        if (!Objects.equals(breed, cat.breed)) return false;
        return Objects.equals(colour, cat.colour);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        return result;
    }
}
