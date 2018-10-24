package com.vincent.springcloud.study.entity;

/**
 * Created by vincent
 * on 2018/10/16 上午9:46
 */
public class Book implements java.io.Serializable{
    private static final long serialVersionUID = -2164058270260403154L;

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
