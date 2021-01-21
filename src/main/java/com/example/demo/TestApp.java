package com.example.demo;

import java.util.*;

public class TestApp {
    public static void main(String[] args) {
        LinkedHashMap<Employee, Department> linkedMap = new LinkedHashMap<>();

        Employee e1 = new Employee(1, "testEmp1");
        Employee e2 = new Employee(2, "testEmp2");
        Employee e3 = new Employee(3, "testEmp3");
        Employee e4 = new Employee(4, "testEmp4");
        Employee e5 = new Employee(5, "testEmp5");
        List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5);

        Department d1 = new Department(1, "testDept1");
        Department d2 = new Department(2, "testDept2");
        Department d3 = new Department(3, "testDept3");
        List<Department> deptList = Arrays.asList(d1, d2, d3);

        Collections.sort(empList);
        for (Employee emp: empList) {
            for (Department dept: deptList) {
                linkedMap.put(emp, dept);
            }
        }

    }
}
