package collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(101,"pune");
        treeMap.put(108,"mumbai");
        treeMap.put(105,"nashik");
        treeMap.put(118,"goa");

        System.out.println(treeMap.subMap(107,119));
        System.out.println(treeMap.tailMap(105,true));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.ceilingEntry(109));
        System.out.println(treeMap.floorEntry(104));
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.higherEntry(111));
        System.out.println(treeMap.lowerEntry(111));
        System.out.println(treeMap);


    }
}
