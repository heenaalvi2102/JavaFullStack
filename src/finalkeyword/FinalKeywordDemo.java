package finalkeyword;
//final variable=> you canot reassign the value to final variable
//
public  class FinalKeywordDemo {
    final int i=90;
    public  void display(){
     //   i=56;


    }

    public static void main(String[] args) {
        FinalKeywordDemo obj = new FinalKeywordDemo();
        obj.display();
        System.out.println(obj.i);
    }
}
