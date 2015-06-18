package com.test.comparator;

import java.util.Comparator;

 public class EmployeeSortingByIdComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {

        return (emp1.getId() < emp2.getId() ) ? -1: (emp1.getId() > emp1.getId() ) ? 1:0 ;

    }

}