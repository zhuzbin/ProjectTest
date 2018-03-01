package com.zhuzb.conf;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/3/1
 * Time：10:27
 */
public class DynamicDataSourceHolder {

    //主库对应的数据源key
    private static final String MASTER = "master";

    //从库对应数据库key
    private static final String SLAVE = "slave";

    //使用ThreadLocal记录当前线程的数据元key
    private static final ThreadLocal<String> holder = new ThreadLocal<String>();

    public static void putDataSourceKey(String key){
        holder.set(key);
    }

    public static String getDataSourceKey(){
        return holder.get();
    }

    public static void markMaster(){
        putDataSourceKey(MASTER);
    }

    public static void markSlave(){
        putDataSourceKey(SLAVE);
    }
}
