package com.sbt.collection.BeforeGenerics;

import java.util.ArrayList;

/**
 * Created by Student on 18.07.2016.
 */
public class CollectionBeforeGenerics {

    public static void main(String[] args){
        ArrayList<Apple> Apples = new ArrayList();
        for (int i=0; i<3;i++){
            Apples.add(new Apple());
        }

        //Apples.add(new Orange());
        for(int i=0;i<3;i++){
            ((Apple)Apples.get(i)).getId();
        }

    }
}
