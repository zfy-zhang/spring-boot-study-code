package com.vincent.springboot.study.bean;

/**
 * Created by vincent on 2018/10/13 上午12:08
 */
public class Dog {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
