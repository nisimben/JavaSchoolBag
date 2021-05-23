package com.company;

import java.util.Objects;

public class Sandwitch extends Item{
    public final String mimrach;

    @Override
    public String toString() {
        return "Sandwitch{" +
                "weight=" + weight +
                ", mimrach='" + mimrach + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sandwitch)) return false;
        if (!super.equals(o)) return false;
        Sandwitch sandwitch = (Sandwitch) o;
        return getMimrach().equals(sandwitch.getMimrach());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMimrach());
    }

    public String getMimrach() {
        return mimrach;
    }

    public Sandwitch(int weight, String mimrach) {
        super(weight);
        this.mimrach = mimrach;
    }
}
