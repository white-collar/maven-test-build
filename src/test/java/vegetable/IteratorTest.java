package vegetable;

import collections.gardener.Plant;
import collections.vegatables.Potato;
import collections.vegatables.Vegetable;
import org.junit.Assert;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void iteratorTest() {
        Plant<Potato> plant = new Plant();
        plant.addVegatableToPlant(new Potato("potato1"));
        plant.addVegatableToPlant(new Potato("potato2"));
        plant.addVegatableToPlant(new Potato("potato3"));
        plant.addVegatableToPlant(new Potato("potato4"));
        plant.addVegatableToPlant(new Potato("potato4"));
        plant.addVegatableToPlant(new Potato("potato6"));
        plant.addVegatableToPlant(new Potato("potato7"));
        plant.addVegatableToPlant(new Potato("potato8"));

        Assert.assertEquals(plant.getVegetableIterator(), plant.getPlant().get(0));
        plant.getNextVegetable();
        Assert.assertEquals(plant.getVegetable().getName(), "potato2");

    }
}
