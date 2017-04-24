package com.idodevjobs.sample.model;
 
public class ExampleModel {
    private String string;
    private int anInt;
    private int anInt1;
 
    public ExampleModel() {}
 
    public ExampleModel(String string, int anInt) {
        this.string = string;
        this.anInt = anInt;
    }
 
    public String getString() {
        return string;
    }
 
    public void setString(String string) {
        this.string = string;
    }
 
    public int getAnInt() {
        return anInt;
    }
 
    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
    
    public int getAnInt1() {
        return anInt1;
    }
 
    public void setAnInt1(int anInt) {
        this.anInt1 = anInt;
    }
 
    @Override
    public String toString() {
        return "ExampleModel{***************" +
                "string='" + string + '\'' +
                ", anInt=" + anInt +
                '}';
    }
}