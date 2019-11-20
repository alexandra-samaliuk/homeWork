package HomeTask6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HomeTask6_4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        HashSet<Integer> keyFromMap = new HashSet<>();
        ArrayList<String> valueFromMap = new ArrayList<>();
        map.put(1, "red");
        map.put(2, "yellow");
        map.put(3, "blue");
        map.put(4, "green");
        map.put(5, "red");
        map.put(6, "black");
        for (Map.Entry<Integer, String> m : map.entrySet()){
            keyFromMap.add(m.getKey());
            valueFromMap.add(m.getValue());
        }
        System.out.println(map);
        System.out.println(keyFromMap);
        System.out.println(valueFromMap);
    }
}
