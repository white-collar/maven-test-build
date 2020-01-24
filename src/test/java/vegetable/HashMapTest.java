package vegetable;

import collections.vegatables.Potato;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

    @Test
    public void hashMapTest() {
        HashMap<Integer, Potato> myHashmap = new HashMap<>();
        myHashmap.put(1, new Potato("potato"));

        Potato potato = myHashmap.get(1);

        Assert.assertEquals(potato.getName(), "potato");
    }


    @Test
    public void hashMapTestKey() {
        Map<String, Potato> hashMap = new HashMap<>();
        hashMap.put("my", new Potato("potato"));
        hashMap.put("my1", new Potato("potato1"));
        hashMap.put("my2", new Potato("potato2"));

        TreeMap<String, Potato>  treeMap = new TreeMap<>();
        treeMap.put("your1", new Potato("your1"));
        treeMap.put("your2", new Potato("your2"));
        treeMap.put("your3", new Potato("your3"));

        Assert.assertEquals(hashMap.get("my").getName(), "potato");
    }
}
