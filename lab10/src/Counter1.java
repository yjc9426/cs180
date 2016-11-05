/**
 * Created by yuan105 on 7/14/16.
 */
public class Counter1 implements Counter {
    private int value = 0;

    public synchronized void inc() {
        value = value + 1;
    }

    public synchronized void dec() {
        value = value - 1;
    }

    public synchronized int get() {
        return value;
    }
}
