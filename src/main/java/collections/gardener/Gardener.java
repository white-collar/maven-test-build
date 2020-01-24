package collections.gardener;

import collections.Pickable;
import collections.vegatables.Vegetable;

public class Gardener<T> implements Pickable<Vegetable> {
    private T vegetable;

    public Gardener(T vegetable) {
        this.vegetable = vegetable;
    }

    public T getVegetable() {
        return vegetable;
    }

    public T doWithVegetables() {
        return vegetable;
    }

    public void setVegetable(T vegetable) {
        this.vegetable = vegetable;
    }



    public void plant() {
        System.out.println("This " + this.vegetable.getClass().getName() + " has been planted");
    }

    @Override
    public void pick() {
        System.out.println(vegetable + " has been picked up");
    }
}
