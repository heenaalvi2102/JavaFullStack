package multithreading;

public class DeadLock {
    public static void main(String[] args) {
        String resource1 = "Printer";
        String resource2 = "Scanner";

        //desktop
        Thread t1 = new Thread(()->{
            synchronized (resource1) {
                System.out.println(Thread.currentThread() .getName()+"locked:"+resource1);
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2){
                    System.out.println(Thread.currentThread() .getName()+"locked:"+resource2);
                }

            }

        });
        //laptop

        Thread t2 = new Thread(()->{
            synchronized (resource2){
                System.out.println(Thread.currentThread() .getName()+ "locked:"+resource2);
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (resource1){
                System.out.println(Thread.currentThread().getName()+ "locked:"+resource1);
            }
        });

        t1.setName("Desktop");
        t2.setName("Scanner");

        t1.start();
        t2.start();

    }

}
