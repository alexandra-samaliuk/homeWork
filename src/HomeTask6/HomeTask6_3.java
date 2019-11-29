package HomeTask6;

import java.util.LinkedList;

public class HomeTask6_3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        boolean side = true;
        for (int i = 0; i < 10; i++) {
            if (linkedList.size() % 2 == 0) {
                linkedList.add(i / 2, i);
            } else if (side){
                linkedList.add(i / 2, i);
                side = false;
            } else {
                linkedList.add(i / 2 + 1, i);
                side = true;
            }
        }
        System.out.println(linkedList);
    }
}