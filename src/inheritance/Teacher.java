package inheritance;

public class Teacher {
    int id;
    String name;
    String address;


}
class MathTeacher extends Teacher{
    public static void main(String[] args){
        MathTeacher obj = new MathTeacher();
        obj.id = 1;
        obj.name ="Heena";
        obj.address ="Pune";
        System.out.println("Id =>");
        System.out.println("name=>");


    }

}
