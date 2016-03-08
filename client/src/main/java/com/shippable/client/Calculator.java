package com.shippable.client;

/**
 * Created by phteluku on 2/29/2016.
 */
public class Calculator {

    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int first, second;



   // public int first, second;

    public Calculator() {
    }

    public int add(){
        return first+second;
    }

    public int prod(){
        return first*second;
    }
}
