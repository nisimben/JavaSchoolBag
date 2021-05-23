package com.company;

import java.util.Objects;

public abstract class Item {
    public int weight;

    public Item(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getWeight() == item.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight());
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
