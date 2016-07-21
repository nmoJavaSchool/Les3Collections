package com.sbt.collection.examples;

import com.sbt.collection.Person;
import com.sbt.collection.PersonFirstLoad;

import java.util.*;

/**
 * Created by Student on 18.07.2016.
 */
public class Example1_ArrayList {


    public static  void main (String[] args){
        List<Person> person = new ArrayList<>();
        PersonFirstLoad.init(person);
        PersonFirstLoad.print(person);

        System.out.println(person.get(10));

        System.out.println("----------------------------------------");
        PersonFirstLoad.print(person.subList(10,15));
        System.out.println("----------------------------------------");
        List<Person> subpersons = person.subList(10,15);
        System.out.println(person.containsAll(subpersons));
        System.out.println("----------------------------------------");
    }
}
