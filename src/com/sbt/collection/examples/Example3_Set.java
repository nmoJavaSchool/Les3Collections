package com.sbt.collection.examples;

import com.sbt.collection.Person;
import com.sbt.collection.PersonFirstLoad;

import java.util.*;

/**
 * Created by Student on 18.07.2016.
 */
public class Example3_Set {


    public static  void main (String[] args){
        Set<Person> person = new HashSet<>();
        PersonFirstLoad.init(person);
        PersonFirstLoad.print(person);

        System.out.println("size= "+person.size());

    }
}
