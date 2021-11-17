package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1092);
        integers.add(234);
        integers.add(345);
        integers.add(5456);

        Collections.sort(integers,Collections.reverseOrder());
        System.out.println(integers);
    }
}
