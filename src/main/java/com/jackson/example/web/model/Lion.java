package com.jackson.example.web.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 *
 * @author five.liu
 */
@JsonTypeName(value = "Lion")
public class Lion extends Animal {

    private String name;

    private int lionessNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLionessNo() {
        return lionessNo;
    }

    public void setLionessNo(int lionessNo) {
        this.lionessNo = lionessNo;
    }

    //    public Lion() {
//    }
//
//    public Lion(String name, int lionessNo) {
//        this.name = name;
//        this.lionessNo = lionessNo;
//    }


}
