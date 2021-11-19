package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    int id;
    String name;
    String Address;

    public ComparatorDemo(int id, String name, String Address) {
        this.id = id;
        this.name = name;
        this.Address = Address;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


    public static void main(String[] args) {
        ComparatorDemo obj = new ComparatorDemo(122, "heena", "pune");
        ComparatorDemo obj1 = new ComparatorDemo(3, "sohel", "mumbai");
        ComparatorDemo obj2 = new ComparatorDemo(14, "meenaj", "nashik");
        ComparatorDemo obj3 = new ComparatorDemo(14, "sadik", "goa");

        List<ComparatorDemo> list = new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Comparator<ComparatorDemo> comparatorId = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo comparatorDemo, ComparatorDemo t1) {
                if (comparatorDemo.id == t1.id) {
                    return 0;
                } else if (comparatorDemo.id > t1.id) {
                    return 1;
                } else {
                    return -1;
                }

            }
        };

        Comparator<ComparatorDemo> comparatorName = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo comparatorDemo, ComparatorDemo t1) {
                return comparatorDemo.name.compareTo(t1.name);
            }
        };

        Collections.sort(list, comparatorId.thenComparing((comparatorDemo, t1) -> {
            return comparatorDemo.name.compareTo(t1.name);
        }).thenComparing(ComparatorDemo::getAddress));
        list.forEach(s -> {
            System.out.println(s.id + " " + s.name);
        });
    }
}




//    @Override
//    public int compareTo(EmpClass empClass) {
//        if (this.id == empClass.id) {
//            return 0;
//
//
//        }else if (this.id > empClass.id){
//            return 6;
//        }else {
//            return -12;
//
//
//        }
//    }
//    @Override
//    public int compareTo(ComparatorDemo empClass){
//        return this.name.compareTo(empClass.name);
////    }
//}


