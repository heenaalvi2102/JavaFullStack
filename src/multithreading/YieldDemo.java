package multithreading;

public class YieldDemo extends Thread{
    @Override
    public void run() {
        Thread.yield();
        //it stop the current thread execution
        //and give chance to another thread for execution
        for (int i=1;i<=5;i++){
            System.out.println("In Run Method");
        }
        System.out.println("Exit");

    }

    public static void main(String[] args) {

        YieldDemo obj = new YieldDemo();
        obj.start();

        for (int i= 1;i<=5;i++){
            System.out.println("In main Method");
        }
    }
}
