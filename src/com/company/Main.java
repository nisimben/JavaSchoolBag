package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ExersiceBook exersiceBook1 = new ExersiceBook(2, "aa", 3, "test");
        ExersiceBook exersiceBook2 = new ExersiceBook(3, "bb", 4, "test");
        Set<ExersiceBook> exersiceBookSet = new HashSet<ExersiceBook>();


        Sandwitch sandwitch = new Sandwitch(2, "sh");
        SchoolBag schoolBag1 = new SchoolBag(22);
        schoolBag1.addTo(sandwitch);
        schoolBag1.addTo(exersiceBook1);
        schoolBag1.addTo(exersiceBook2);
        schoolBag1.addTo(exersiceBook2);
        schoolBag1.addTo(exersiceBook1);
        System.out.println(schoolBag1);
        }
    }
