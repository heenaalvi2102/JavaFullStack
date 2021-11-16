package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 2;
        arr[3] = 3;

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(20);
        list.add(30);
        list.add(40);



//        System.out.println(list.get(1));
//        System.out.println(list.remove(1));
//        System.out.println(list.size());
//        System.out.println(list.contains(20));
        System.out.println(list.isEmpty());
        System.out.println(list);


        //list.forEach(s->{
        //System.out.println(s);
        // });
        Iterator iterator =list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(22);


        List<Integer> list5 = new ArrayList<>(Arrays.asList(1233,234,345,567));

        List<Integer> list3 = new ArrayList<>(List.of(12,2,3,4));

        List<Integer> list4 = new ArrayList<>(){{
            add(12);
            add(34);
        }};



    }
}
