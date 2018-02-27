package com.zhuzb.model;

import java.util.List;
import java.util.Set;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/22
 * Time：16:01
 */
public class Student {

    private int id;
    private String name;
    private int age;
    private int gradesId;
    private Grades grades;
    private List<Teacher> teachers;

    public int getGradesId() {
        return gradesId;
    }

    public void setGradesId(int gradesId) {
        this.gradesId = gradesId;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grades=" + grades +
                ", teachers=" + teachers +
                '}';
    }
}
