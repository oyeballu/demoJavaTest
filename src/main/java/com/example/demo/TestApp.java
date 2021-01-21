package com.example.demo;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class TestApp {
    public static void main(String[] args) {
        TreeMap<Employee, Department> treeMapEmp = new TreeMap<>();
        LinkedHashMap<Employee, Department> treeMapDept = new LinkedHashMap<>();

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

        for (Employee emp: empList) {
            for (Department dept: deptList) {
                treeMapEmp.put(emp, dept);
            }
        }

        //Ques 1: mapped (emp & dept) and sorted based on empId
        // also, treeMap is used to always maintain the sorting and uniqueness
        for(Map.Entry<Employee, Department> entry: treeMapEmp.entrySet()){
            Employee myEmp = entry.getKey();
            System.out.println("Emp id: "+myEmp.getId());

            treeMapDept.put(entry.getKey(), entry.getValue());
        }

        //Ques 2: sort based on deptId
        for(Map.Entry<Employee, Department> entry: treeMapDept.entrySet()){
            Employee myEmp = entry.getKey();
            System.out.println("Dept id: "+myEmp.getId());
        }
    }
}
