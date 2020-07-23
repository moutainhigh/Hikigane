package me.stevenkin.hikigane.core.kit;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorKit {
    public static ExecutorService newExecutor(Integer threadNum, Integer queueSize, final String threadNamePrefix){
        return newExecutor(threadNum, threadNum + 1, queueSize, threadNamePrefix);
    }

    public static ExecutorService newExecutor(Integer coreSize, Integer maxSize, Integer queueSize, final String threadNamePrefix){
        return new ThreadPoolExecutor(coreSize, maxSize,
                60L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(queueSize),
                new ThreadFactory() {

                    private AtomicInteger id = new AtomicInteger(0);

                    @Override
                    public Thread newThread(Runnable r) {
                        Thread t = new Thread(r);
                        t.setName(threadNamePrefix + id.incrementAndGet());
                        return t;
                    }
                },
                new ThreadPoolExecutor.DiscardPolicy()
        );
    }
}
