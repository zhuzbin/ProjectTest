package com.zhuzb.dao;

import com.zhuzb.model.Grades;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/22
 * Time：17:08
 */
public interface GradesMapper {
    public Grades getById(int id);

    public void save(Grades grades);
}
