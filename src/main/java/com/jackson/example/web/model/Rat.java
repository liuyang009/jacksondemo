package com.jackson.example.web.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 *
 * @author five.liu
 */
@JsonTypeName(value = "Rat")
public class Rat extends Animal {

    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
