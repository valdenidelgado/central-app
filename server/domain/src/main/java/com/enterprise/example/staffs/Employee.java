package com.enterprise.example.staffs;

import com.enterprise.example.AggregateRoot;

public class Employee extends AggregateRoot<EmployeeID> {
    public Employee(EmployeeID employeeID) {
        super(employeeID);
    }
}
