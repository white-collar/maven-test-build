package collections.gardener;

import collections.Vegetableable;
import collections.vegatables.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class Plant<Vegetable> implements Vegetableable {
    private List<Vegetable> plant = new ArrayList<>();
    private Integer currentPosition = 0;

    public Plant() {
    }

    public Vegetable getVegetable() {
        return plant.get(currentPosition);
    }

    public List<Vegetable> getPlant() {
        return plant;
    }

    public void addVegatableToPlant(Vegetable vegetable) {
        this.plant.add(vegetable);
    }

    @Override
    public Object getVegetableIterator() {
        return plant.get(currentPosition);
    }

    @Override
    public Vegetable getNextVegetable() {
        currentPosition++;
        return plant.get(currentPosition);
    }
}
