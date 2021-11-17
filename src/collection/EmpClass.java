package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpClass implements Comparable<EmpClass>{
    int id;
    String name;

    public EmpClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        EmpClass obj = new EmpClass(122,"heena");
        EmpClass obj1 = new EmpClass(3,"sohel");
        EmpClass obj2 = new EmpClass(14,"meenaj");

        List<EmpClass> list = new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        Collections.sort(list);
        list.forEach(s->{
            System.out.println(s.id + " " + s.name);
        });


    }


    @Override
    public int compareTo(EmpClass empClass) {
        if (this.id == empClass.id) {
            return 0;


        }else if (this.id > empClass.id){
            return 6;
        }else {
            return -12;


        }
    }
}
