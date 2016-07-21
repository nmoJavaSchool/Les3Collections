package com.sbt.collection.examples;

import com.sbt.collection.Person;
import com.sbt.collection.PersonFirstLoad;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Student on 18.07.2016.
 */
public class Example5_Map {


    public static  void main (String[] args){
        Map<String, Person> person = new HashMap<>();
        PersonFirstLoad.init(person);
        PersonFirstLoad.print(person);

        System.out.println("size= "+person.size());

        System.out.println(person.get("16"));
    }
}
