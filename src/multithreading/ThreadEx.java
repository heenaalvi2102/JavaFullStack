//package multithreading;
//
//public class ThreadEx {
//    int num;
//    public void set(int num){
//        this.num = num;
//        System.out.println("set:" +this.num);
//
//    }
//
//    public void get(){
//        System.out.println("Get:"+ num);
//    }
//    }
//
//
//    class Producer implements Runnable{
//
//    ThreadEx threadEx;
//    public Producer(ThreadEx threadEx){
//        this.threadEx = threadEx;
//        Thread t1 = new Thread(this);
//        t1.start();
//
//    }
//
//        @Override
//        public void run() {
//
//        }
//    }
//
//    class main {
//        public static void main(String[] args) {
//           ThreadEx threadEx = new ThreadEx(ThreadEx);
//           Producer producer = new Producer(ThreadEx);
//        }
//    }

