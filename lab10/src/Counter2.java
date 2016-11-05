import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yuan105 on 7/14/16.
 */
public class Counter2 implements Counter {
    AtomicInteger value = new AtomicInteger(0);

    public void inc() {
        value.incrementAndGet();
    }

    public void dec() {
        value.decrementAndGet();
    }

    public int get() {
        return value.get();
    }
}
