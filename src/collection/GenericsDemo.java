package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        iterate(list);


        List<String> list1 = new ArrayList<>();
        list1.add("pune");
        list1.add("mumbai");
        list1.add("goa");
        list1.add("nashik");

        iterate(list1);
    }
    private static void iterate(List<?> list){
        list.forEach(s->{
            System.out.println(s);
        });

    }
}


//how Hashmap work internally
//spring .io