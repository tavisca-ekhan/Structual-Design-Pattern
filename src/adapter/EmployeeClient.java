package adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDb);

        // Will not work
        // Employee employeeFromLdap = new EmployeeLdap("1121", "Ebran", "Khan", "ebran@khan.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("1121", "Ebran", "Khan", "ebran@khan.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("5678,Sherlock,Holmes,sherlock@holmes.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return  employees;
    }
}
