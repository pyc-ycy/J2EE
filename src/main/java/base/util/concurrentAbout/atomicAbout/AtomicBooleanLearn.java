package base.util.concurrentAbout.atomicAbout;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanLearn {
    public static void main(String[] args) {
        AtomicBoolean AB1 = new AtomicBoolean(true);
        AtomicBoolean AB2 = new AtomicBoolean();
        AB2.set(true);
        boolean b = AB1.compareAndSet(false, AB2.get());
        System.out.println("AB1.compareAndSet(false, AB2.get())=" + b);
        boolean b1 = AB2.weakCompareAndSetAcquire(true, AB1.get());
        System.out.println("AB2.weakCompareAndSetAcquire(true, AB1.get()) = " + b1);
        boolean AB1Value = AB1.getAndSet(false);
        System.out.println("AB1.getAndSet(false) = " + AB1Value + ", and AB1.get() = " + AB1.get());
        AB2.lazySet(false);
        System.out.println("AB2 after lazySet: " + AB2.get());
        b = AB1.compareAndSet(false, AB2.get());
        System.out.println("AB1.compareAndSet(false, AB2.get())=" + b);
        System.out.println("AB1 new value: " + AB1.get());
    }
}
