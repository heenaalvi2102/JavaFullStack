package constructor;

public class ConstructorEx {
    int id;
    String name;
    boolean flag;

    public ConstructorEx(){
        System.out.println("id=>" +id +name +"flag=>" +flag);
    }
    public ConstructorEx(int i){
        System.out.println("in parameterized constructor");
    }

    public static void main(String[] args) {
        ConstructorEx obj=new ConstructorEx();
    }
}
