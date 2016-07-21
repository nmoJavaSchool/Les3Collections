package com.sbt.collection.examples;

import com.sbt.collection.Person;
import com.sbt.collection.PersonFirstLoad;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Student on 18.07.2016.
 */
public class Example4_LinkedHashSet {


    public static  void main (String[] args){
        Set<Person> person = new LinkedHashSet<>();
        PersonFirstLoad.init(person);
        PersonFirstLoad.print(person);

        System.out.println("size= "+person.size());

    }
}
