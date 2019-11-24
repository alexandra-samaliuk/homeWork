package homeTask5.homeTask5_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionUnit {
    public void createArrayList (String[] array){
        System.out.println("ArrayList");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            arrayList.add(array[i]);
        }
        for (String a: arrayList){
            System.out.println(a.toString());
        }
    }

    public void createLinkedList (String[] array){
        System.out.println("LinkedList");
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < array.length; i++){
            linkedList.add(array[i]);
        }
        for (String a: linkedList){
            System.out.println(a.toString());
        }
    }

    public void createQueue (String[] array){
        System.out.println("Queue");
        PriorityQueue<String> queue = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++){
            queue.add(array[i]);
        }
        for (String a: queue){
            System.out.println(a.toString());
        }
    }
}
