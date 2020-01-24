package collections;

import com.sun.deploy.util.OrderedHashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        Set<Apple> applesSet =  new HashSet();
        applesSet.add(new Apple("apple1"));
        applesSet.add(new Apple("apple1"));
        applesSet.add(new Apple("apple3"));
        applesSet.add(new Apple("apple4"));
        applesSet.add(new Apple("apple5"));

        for (Apple apple: applesSet) {
            System.out.println(apple.getName());
        }
        System.out.println("=====================");
        Set<Apple> orderedSet = new TreeSet<Apple>();
        orderedSet.add(new Apple("apple1"));
        orderedSet.add(new Apple("apple2"));
        orderedSet.add(new Apple("apple3"));
        orderedSet.add(new Apple("apple4"));
        orderedSet.add(new Apple("apple5"));

        for (Apple apple: orderedSet) {
            System.out.println(apple.getName());
        }




    }
}
