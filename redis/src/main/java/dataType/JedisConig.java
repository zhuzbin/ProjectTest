package dataType;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/23
 * Time：16:31
 */
public class JedisConig {
    private static JedisPool pool = new JedisPool("192.168.218.128",6379);
    private static Jedis jedis = pool.getResource();

    public static Jedis init(){
        return jedis;
    }

    public static void close(){
        jedis.close();
        pool.close();
    }
}
