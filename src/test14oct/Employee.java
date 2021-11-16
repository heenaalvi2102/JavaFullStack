package test14oct;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    int empId;
    String empName;
    String empAdd;
    int Salary;

    public Employee(int empId, String empName, String empAdd, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAdd = empAdd;
         this.Salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1,"heena","pune",1234);
        Employee employee1 = new Employee(1,"heena","pune",1234);
        Employee employee2 = new Employee(1,"heena","pune",1234);

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);

        list.forEach(s->{
            System.out.println(s.empId+" "+ s.Salary);
        });

    }
}
