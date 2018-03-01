package com.zhuzb.service;

import com.zhuzb.dao.CountryDao;
import com.zhuzb.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/3/1
 * Time：11:36
 */
@Service
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    public List<Country> getAll(){
        return countryDao.getAll();
    }

    public void saveCountry(Country country){
        countryDao.saveCountry(country);
    }
}
