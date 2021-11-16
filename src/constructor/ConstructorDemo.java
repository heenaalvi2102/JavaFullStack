package constructor;

public class ConstructorDemo {
    int id;
    String name;
    boolean flag;

    public ConstructorDemo(){
        System.out.println("id=>" +id +name +"flag=>" +flag );

    }
    public ConstructorDemo(int i){
        System.out.println("In Parameterized Constructor");
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();

    }
}
//in constructor same name of class
//object is create constructor is declared