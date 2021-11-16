package exceptionhandling;

public class ThrowKeyword {
    public static void main(String[] args) throws Exception {
        int age =17;
        if(age<18){
            throw new Exception("you can not vote");

        }else{
            System.out.println("you can vote");
        }
    }
}


class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
//method overloading
//method overriding