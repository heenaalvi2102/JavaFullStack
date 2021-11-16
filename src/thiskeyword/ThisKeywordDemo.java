package thiskeyword;

public class ThisKeywordDemo {
    int id;
    String name;
    String address;
    public ThisKeywordDemo(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void display(){
        System.out.println("In display");
    }
    public ThisKeywordDemo(int id,String name){
        this();
       // this(1,"Rahul","kohlapur");
    }
    public ThisKeywordDemo(){
        System.out.println("Default cont");
    }
    public void show(){
        this.display();
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo(1,"Akash");
        System.out.println("Id=> "+ obj.id+ " name=> "+ obj.name+"address=>" +obj.address);
        obj.show();
    }
}
