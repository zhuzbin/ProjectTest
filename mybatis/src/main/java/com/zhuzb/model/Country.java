package com.zhuzb.model;

import java.io.Serializable;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/1/15
 * Time：11:45
 */
public class Country implements Serializable {

    private int id;
    private String country_name;
    private String country_code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public Country(String country_name, String country_code) {
        this.country_name = country_name;
        this.country_code = country_code;
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", country_name='" + country_name + '\'' +
                ", country_code='" + country_code + '\'' +
                '}';
    }
}
