package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SchoolBag {
    public int maxWeigth;
    public Set<ExersiceBook>exersiceBookSet = new HashSet<>();

    @Override
    public String toString() {
        return "SchoolBag{" +
                "maxWeigth=" + maxWeigth +
                ", exersiceBookSet=" + exersiceBookSet +
                ", list=" + list +
                '}';
    }

    public List<Item> list = new ArrayList<>();

    public SchoolBag(int maxWeigth) {
        this.maxWeigth = maxWeigth;
    }
    public void addTo(Item item) {

        for(Item i :list) {
            if (i instanceof ExersiceBook && !((ExersiceBook) item).profession.equals(((ExersiceBook) i).profession)){
                list.add(item);
            }
            else if (i instanceof Sandwitch){
                list.add(item);
            }
            else {
                System.out.println("it exist");
            }
        }
    }

}
