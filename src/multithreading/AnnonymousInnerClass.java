package multithreading;



public class AnnonymousInnerClass {
    public static void main(String[] args) {
        MyInterface myInterFace = new MyInterface(){
            public int add(int a,int b){
                return a+b;

            }
            
        };
        System.out.println(myInterFace.add(2,6));

    }
}

interface MyInterface{
    int add(int a,int b);
}
