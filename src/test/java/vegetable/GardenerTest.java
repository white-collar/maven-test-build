package vegetable;

import collections.gardener.Gardener;
import collections.vegatables.Garlik;
import collections.vegatables.Potato;
import collections.vegatables.Vegetable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GardenerTest {

    @Test
    public void testGardener() {
        Gardener<Vegetable> gardener = new Gardener(new Potato("potato"));
        gardener.plant();
    }

    @Test
    public void testSimpleList() {
        List<? extends Number> intList = new ArrayList<Integer>();
    }

    @Test
    public void testLists() {
        List<Potato> vegetablesList = new ArrayList<Potato>();
        vegetablesList.add(new Potato("1"));

        System.out.println();
    }

    public void testTypes() {
        Vegetable vegetable = new Vegetable();
        Garlik garlik = new Garlik("garlik");
        Potato potato = new Potato("potato");

        potato = (Potato) vegetable;
    }
}
