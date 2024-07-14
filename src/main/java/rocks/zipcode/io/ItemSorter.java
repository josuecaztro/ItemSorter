package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    private Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        ArrayList<Item> myList = new ArrayList<>(Arrays.asList(items));
        myList.sort(Comparator.comparing(Item::getId));
        Item[] solution = myList.toArray(new Item[0]);
        return solution;
    }

}
