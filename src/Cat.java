import java.util.Objects;

public class Cat {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String name;
    private String color;


    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }


}
