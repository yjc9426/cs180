import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yuan105 on 7/14/16.
 */
public class Driver implements Runnable {
    public int start;
    public int end;
    // private static int counter;
    //public static Object a = new Object();
    static AtomicInteger counter = new AtomicInteger(0);              //static --- all thread could access it



  //  public  synchronized void increament(){
   //     counter++;
//        synchronized(a){                           //synchronized lock --- creating more than one thread, use one lock to let them run one by one
//            counter++;
//        }
  //  }

    public Driver(int start, int end){
        this.start = start;
        this.end = end;
        //this.counter = 0;
    }
    public void run(){
        for (int i = start; i < end; i++){
            if (i % 7 == 0) {
                counter.incrementAndGet();
            }
        }
    }
    public static void main(String[] args){
        try {
            Thread t = new Thread(new Driver(1, 1000));
            t.start();
            Runnable r = new Driver(1001, 2000);
            Thread t2 = new Thread(r);
            t2.start();
            Thread t3 = new Thread(new Driver(2001, 3000));
            t3.start();
            t.join();
            t2.join();
            t3.join();
            System.out.println(counter.get());
        } catch (InterruptedException e) {
            System.out.println("Big problem");
        }
    }
}
