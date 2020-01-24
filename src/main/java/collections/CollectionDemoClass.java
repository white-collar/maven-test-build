package collections;

import java.util.*;

public class CollectionDemoClass {
    public static void main(String[] args) {
        List<Apple> applesList = new ArrayList(30);
        applesList.add(new Apple("gold"));
        applesList.add(new Apple("clever"));
        applesList.add(new Apple("apple1"));
        System.out.println(applesList.toString());
        System.out.println(applesList.size());
        System.out.println(applesList.toString());
        System.out.println(applesList.size());
        applesList.add(new Apple("apple1"));
        applesList.add(new Apple("Apple10"));
        System.out.println(applesList.toString());

        for (int i = 0; i < applesList.size(); i++) {
            System.out.println(applesList.get(i));
        }
        System.out.println("=====");
        for (Apple apple : applesList) {
            System.out.println(apple);
        }
        System.out.println("=====");
        Iterator iterator = applesList.iterator();

        while (iterator.hasNext()) {
            System.out.println(((Apple) iterator.next()).getName());
        }
    }
}
