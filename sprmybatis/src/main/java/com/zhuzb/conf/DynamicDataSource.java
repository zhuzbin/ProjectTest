package com.zhuzb.conf;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/3/1
 * Time：10:20
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    protected Object determineCurrentLookupKey() {
        //使用DynamicDataSourceHolder保证线程安全，并且得到当前线程中的数据源key
        return DynamicDataSourceHolder.getDataSourceKey();
    }
}
