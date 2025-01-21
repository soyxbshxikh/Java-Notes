package Collection;

import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // add data in array
        list.add("hello");
        list.add("public");
        list.add("array");
        list.add("list");
        System.out.println(list);
        
        // add data between the array
        list.add(2, "nothing");
        System.out.println(list);
        
        // set element at index 0
        list.set(0, "some");
        System.out.println(list);
        
        // get element from array
        String element = list.get(0);
        System.out.println(element);
        
        // remove the data from array
        list.remove(4);
        System.out.println(list);
        
        // get size of array List
        int size = list.size();
        System.out.println(size);

        // for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        
        // sort the collection
        Collections.sort(list);
        System.out.println(list);
    }
}
