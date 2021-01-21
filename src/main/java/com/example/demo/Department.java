package com.example.demo;

public class Department implements Comparable<Employee> {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        if (o.getId() < this.id) {
            return -1;
        } else if (o.getId() > this.id) {
            return 1;
        }
        return 0;
    }
}
