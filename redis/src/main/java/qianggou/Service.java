package qianggou;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by liuyang on 2017/4/20.
 */
public class Service {
    private static JedisPool pool = null;

    static {
        JedisPoolConfig config = new JedisPoolConfig();
        // 设置最大连接数
        config.setMaxTotal(200);
        // 设置最大空闲数
        config.setMaxIdle(8);
        // 设置最大等待时间
        config.setMaxWaitMillis(1000 * 100);
        // 在borrow一个jedis实例时，是否需要验证，若为true，则所有jedis实例均是可用的
        config.setTestOnBorrow(true);
        pool = new JedisPool(config, "192.168.218.128", 6379, 3000);
    }

    DistributedLock lock = new DistributedLock(pool);

    int n = 5;

    public void seckill() {
        //System.out.println(Thread.currentThread().getName());
        // 返回锁的value值，供释放锁时候进行判断
        String indentifier = lock.lockWithTimeout("resource", 5000, 1000);
        if(indentifier == null||"".equals(indentifier)){
            System.out.println(Thread.currentThread().getName()+"没有获得锁");
        }
        System.out.println(Thread.currentThread().getName() + "获得了锁");
        if(n>0){
            System.out.println(--n);
        }else{
            System.out.println("该商品已经没有了");
        }

        lock.releaseLock("resource", indentifier);
    }
}
