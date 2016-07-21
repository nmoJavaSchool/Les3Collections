package com.sbt.collection.BeforeGenerics;

/**
 * Created by Student on 18.07.2016.
 */
public class Apple {
    final long id = counter++;
    static Long counter = new Long(0L);


    public long getId() {
        return id;
    }
}

