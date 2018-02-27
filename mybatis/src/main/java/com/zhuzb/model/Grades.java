package com.zhuzb.model;

import java.io.Serializable;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/22
 * Time：16:09
 */
public class Grades implements Serializable {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
