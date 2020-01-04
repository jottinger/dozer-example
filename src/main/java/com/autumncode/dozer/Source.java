package com.autumncode.dozer;

import com.google.common.base.Objects;

public class Source {
    public Source(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public Source() {
    }

    String name;
    int value;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Source source = (Source) o;
        return value == source.value &&
                Objects.equal(name, source.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, value);
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
