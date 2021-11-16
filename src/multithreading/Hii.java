package multithreading;

public class Hii extends Thread{
    public void run(){
        for(int i =1; i<=5;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
class Hello implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
class Multithreading{

    public static void main(String[] args) {
        Hii hi =new Hii();
        hi.start();
        Hello hello = new Hello();
        Thread t1 = new Thread();
        t1.start();
       // hi.join();
       // t1.join();
    }
}
