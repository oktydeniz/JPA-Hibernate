package com.example.jpahipernate.model;

import javax.persistence.Convert;
import javax.persistence.Converter;

public enum Color {
    RED("red"),
    WHITE("white");

    private final String value;
    Color(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
