package com.gzy;

import com.gzy.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Test {




    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person guoqi = new Person("晏国淇", 89);
        Person guoqi2 = new Person("007");
        com.gzy.Teacher t = new com.gzy.Teacher("fdfd", 3333, "副教授");

        List<Person> persons = new ArrayList<>();  //线性表
        List<Person> persons2 = new LinkedList<>(); //单链表

        persons2.add(guoqi);
        persons2.add(guoqi2);

        persons.add(guoqi);
        persons.add(guoqi2);







        t.addAge();

        System.out.println(" age =" + t.getAge() + ", name = " + t.getName() + " title = " + t.getTitle());











    }
}

