package com.company;

import java.util.Objects;

public class ExersiceBook extends Item{
    public final String profession;
    public final int pages;
    public String homeWork;

    @Override
    public String toString() {
        return "ExersiceBook{" +
                "profession='" + profession + '\'' +
                ", pages=" + pages +
                ", homeWork='" + homeWork + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExersiceBook)) return false;
        if (!super.equals(o)) return false;
        ExersiceBook that = (ExersiceBook) o;
        return getPages() == that.getPages() && getProfession().equals(that.getProfession()) && getHomeWork().equals(that.getHomeWork());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getProfession(), getPages(), getHomeWork());
    }

    public String getProfession() {
        return profession;
    }

    public int getPages() {
        return pages;
    }

    public String getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(String homeWork) {
        this.homeWork = homeWork;
    }

    public ExersiceBook(int weight, String profession, int pages, String homeWork) {
        super(weight);
        this.profession = profession;
        this.pages = pages;
        this.homeWork = homeWork;
    }
}
