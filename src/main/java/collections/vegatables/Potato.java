package collections.vegatables;

public class Potato extends Vegetable implements Comparable<Potato> {
    private String name;

    public Potato(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Potato o) {
        return 0;
    }
}
