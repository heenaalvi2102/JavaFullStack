package collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
    int EmpId;
    String EmpName;
    String Address;


    public EmployeeDemo(int empId, String empName, String address) {
        EmpId = empId;
        EmpName = empName;
        Address = address;
    }


    public static void main(String[] args) {
    EmployeeDemo employeeDemo1 = new EmployeeDemo(1,"heena","pune") ;
    EmployeeDemo employeeDemo2 = new EmployeeDemo(2,"xyz","pune") ;
    EmployeeDemo employeeDemo3 = new EmployeeDemo(3,"lmn","goa") ;

        List<EmployeeDemo> list = new ArrayList<>();
        list.add(employeeDemo1);
        list.add(employeeDemo2);
        list.add(employeeDemo3);
        list.forEach(s->{
            System.out.println(s.EmpId +" " + s.EmpName + " " + s.Address);
        });

    }
}
