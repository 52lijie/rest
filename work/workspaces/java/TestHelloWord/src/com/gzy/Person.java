package com.gzy;

/**
 * Created by xu on 17/3/4.
 */
public class Person {

    private String mName;
    protected int mAge;

    public Person(){

    }

    //构造函数
    public Person(String name, int age){
        mName = name;
        mAge = age;
    }

    public Person(String name){
        mName = name;
    }

    public int getAge(){
        return mAge;
    }

    public String getName(){
        return mName;
    }

    public void setName(String name){

        mName = name;

    }

    public void setAge(int age){
        mAge = age;
    }


}
