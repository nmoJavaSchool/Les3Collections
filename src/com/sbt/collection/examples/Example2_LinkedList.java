package com.sbt.collection.examples;

import com.sbt.collection.Person;
import com.sbt.collection.PersonFirstLoad;

import java.util.*;

/**
 * Created by Student on 18.07.2016.
 */
public class Example2_LinkedList {


    public static  void main (String[] args){
        LinkedList<Person> person = new LinkedList<>();
        PersonFirstLoad.init(person);
        PersonFirstLoad.print(person);

    }
}
