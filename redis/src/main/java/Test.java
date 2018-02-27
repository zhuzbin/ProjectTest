import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/23
 * Time：14:53
 */
public class Test {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool("192.168.218.128",6379);
        Jedis jedis = pool.getResource();
        String aa = jedis.get("aaa");
        //jedis.exists("aaa");
        System.out.println(jedis.exists("aaa"));
        jedis.close();
        pool.close();
    }
}
