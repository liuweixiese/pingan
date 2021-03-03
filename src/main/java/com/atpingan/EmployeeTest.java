package com.atpingan;

/**
 * @author shkstart
 * @create 2021-02-24 10:26
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee lw = new Employee("liuwei");
        lw.empAge(27);
        lw.empDesignation("程序员");
        lw.empSalary(10000);
        lw.printEmployee();



    }
}
