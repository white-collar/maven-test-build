package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPineapple {
    public static void main(String[] args) {
        List<Pineapple> pineappleList = new LinkedList<>();
        pineappleList.add(new Pineapple("p1"));
        pineappleList.add(new Pineapple("p2"));
        pineappleList.add(new Pineapple("p3"));
    }
}
