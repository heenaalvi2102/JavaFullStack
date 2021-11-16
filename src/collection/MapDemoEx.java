package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemoEx {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"xyz");
        map.put(2,"mnp");
        map.put(3,"qpo");

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(4,"xyz-1");
        map1.put(5,"mnp-1");
        map1.put(6,"qpo-1");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(8,"xyz-2");
        map2.put(9,"mnp-2");
        map2.put(7,"qpo-2");

        List<Map<Integer,String>>list = new ArrayList<>();
        list.add(map);
        list.add(map1);
        list.add(map2);

        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println(k+" "+v);
            });

        });
        System.out.println();




    }
}
