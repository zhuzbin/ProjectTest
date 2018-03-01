package com.zhuzb.dao;

import com.zhuzb.model.Country;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/1/15
 * Time：11:52
 */
@Repository
public interface CountryDao {
    public Country getById(@Param("id") String id, @Param("countryName") String countryName);

    /**
     * Desc：保存用户
     * User：ZhuZhiBin
     * Date：2018/1/15
     * Time：14:47
     */
    public int saveCountry(Country country);

    public List<Country> getAll();
}
