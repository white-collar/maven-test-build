package collections;

import java.util.Comparator;
import java.util.Objects;

public class Apple implements Comparable<Apple> {
    private String name;

    public Apple(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Apple o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Objects.equals(name, apple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
