package com.gzy;

import com.gzy.Person;

/**
 * Created by xu on 17/3/4.
 */
public class Teacher extends Person {
    private String title ;

    public Teacher(String name, int age, String title){
        super(name, age);
        this.title = title;
    }

    public String getTitle(){
        return title;

    }

    public void addAge(){
        mAge++;
    }


}
