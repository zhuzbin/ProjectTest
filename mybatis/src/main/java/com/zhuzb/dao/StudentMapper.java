package com.zhuzb.dao;

import com.zhuzb.model.Student;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/22
 * Time：16:26
 */
public interface StudentMapper {

    public Student getById(int id);

    public void save(Student student);

    public Student getByIdTea(int id);
}
