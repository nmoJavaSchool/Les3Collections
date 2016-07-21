package com.sbt.collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by Student on 18.07.2016.
 */
public class Person implements Comparable<Person> {
    public Person(long id, String name, String phoneNumber) {
        Id = id;
        Name = name;
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person id= "+getId() + ":name = "+getName() + ": PhoneNumber = " + getPhoneNumber();
    }

    @Override
    public int hashCode() {
        return (this.getId()+this.getName()+this.getPhoneNumber()).hashCode();
    }
@Override
    public boolean equals(Object obj) {
      return this.getId().equals(((Person)obj).getId());
    }

    long Id;
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    String Name;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    String PhoneNumber;
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Person o) {
        return this.getPhoneNumber().compareTo(o.getPhoneNumber());
    }
}
