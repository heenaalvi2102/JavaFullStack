package test14oct;

public class Student {
    int rollNo;
    String name;
    int contactNo;
    int totalMarks;

    public Student(int rollNo, String name, int contactNo, int totalMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.contactNo = contactNo;
        this.totalMarks = totalMarks;
    }

    public void display(){
        System.out.println("roll=>"+rollNo +"name=>" +name+"contactNo"+contactNo+"totalmarks=>"+totalMarks);
    }
}
