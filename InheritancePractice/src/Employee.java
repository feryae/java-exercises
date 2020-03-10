/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */
public class Employee {

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    private String name;
    double salary;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
