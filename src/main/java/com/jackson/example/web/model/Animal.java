package com.jackson.example.web.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 *
 * @author five.liu
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "typeName",defaultImpl = Rat.class)
@JsonSubTypes({
    @JsonSubTypes.Type(value=Lion.class,name="Lion")
        ,@JsonSubTypes.Type(value=Rat.class,name="Rat")})
public  abstract class Animal {

    private int id;

    private String typeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
