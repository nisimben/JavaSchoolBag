package com.company;

import java.util.Objects;

public class StudyBook extends Item{
    public final String profession;
    public final int pages;


    public StudyBook(int weight, String profession, int pages) {
        super(weight);
        this.profession = profession;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "StudyBook{" +
                "weight=" + weight +
                ", profession='" + profession + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudyBook)) return false;
        if (!super.equals(o)) return false;
        StudyBook studyBook = (StudyBook) o;
        return getPages() == studyBook.getPages() && getProfession().equals(studyBook.getProfession());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getProfession(), getPages());
    }

    public String getProfession() {
        return profession;
    }

    public int getPages() {
        return pages;
    }
}
