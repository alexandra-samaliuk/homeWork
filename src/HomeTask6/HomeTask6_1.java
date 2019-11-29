package HomeTask6;


import java.util.HashMap;
import java.util.Map;

public class HomeTask6_1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("яблоко", "фрукт");
        map.put("банан", "фрукт");
        map.put("клубника", "ягода");
        map.put("огурец", "овощ");
        map.put("перец", "овощ");
        map.put("черника", "ягода");
        printMap(map);
        printMapExact(map, "банан");
    }

    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " это " + m.getValue());
        }
    }

    public static void printMapExact(Map<String, String> map, String key) {
        System.out.println(key + " это " + map.get(key));

    }
}
