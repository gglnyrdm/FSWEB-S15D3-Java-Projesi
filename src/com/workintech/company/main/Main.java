package com.workintech.company.main;

import com.workintech.company.model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Gulin","Yardimoglu");
        Employee emp2 = new Employee(2,"Dogancan","Kinik");
        Employee emp3 = new Employee(3,"Elif","Saglam");
        Employee emp4 = new Employee(4,"Bilge","Goksu");
        Employee emp5 = new Employee(5,"Gokmen","Test");
        Employee emp6 = new Employee(6,"Anil","Ensari");
        Employee emp7 = new Employee(2,"Data","Test");
        Employee emp8 = new Employee(3,"Tekrar","Data");

        List<Employee> employees = new LinkedList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);

        List<Employee> duplicatedEmployees = new LinkedList<>();
        Map<Integer,Employee> mapEmployees = new HashMap<>();

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(mapEmployees.containsKey(employee.getId())){
                duplicatedEmployees.add(employee);
                iterator.remove();
            }else {
                mapEmployees.put(employee.getId(),employee);
            }
        }
        System.out.println("All Employees: " + employees);
        System.out.println("-----------------");
        System.out.println("Duplicate Employees: " + duplicatedEmployees);
        System.out.println("---------------------");
        System.out.println("Map Employees: " + mapEmployees);
    }
}