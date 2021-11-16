package statickeyword;

public class StaticKeyword {
    int id;
    String name;
    static String companyName = "ABC";

    public StaticKeyword(int id,String name){
        this.id =id;
        this.name= name;
    }


    public static void main(String[] args) {
        StaticKeyword obj = new StaticKeyword(1,"heena");
        StaticKeyword obj1 = new StaticKeyword(2,"meenaj");
        StaticKeyword obj2 = new StaticKeyword(3,"sohel");

        obj.display();
        obj1.display();
        obj2.display();
    }
    public void display(){
        System.out.println("Id=> "+id+ " name=> "+name+ " company name=> " +companyName);
    }
}
