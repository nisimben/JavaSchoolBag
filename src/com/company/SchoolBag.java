package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SchoolBag {
    public int maxWeigth;

    @Override
    public String toString() {
        return "SchoolBag{" +
                "maxWeigth=" + maxWeigth +
                ", list=" + list +
                '}';
    }

    public List<Item> list = new ArrayList<>();

    public SchoolBag(int maxWeigth) {
        this.maxWeigth = maxWeigth;
    }
    public boolean included(ExersiceBook item){
        for (Item i:
             list) {
            if (i instanceof ExersiceBook && item.profession.equals(((ExersiceBook) i).profession)){
                return true;
            }

        }
        return false;
    }
    public void addTo(Item item) {
            if (item instanceof ExersiceBook && !included(((ExersiceBook) item))){
                list.add(item);
            }
            else if (item instanceof Sandwitch){
                list.add(item);
            }
            else {
                System.out.println("it exist");
            }
        }
    }


