/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */
public class Employees implements Comparable<Employees> {

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    private String name;
    private double salary;
    
    
    
    @Override
    public int compareTo(Employees o) {
       return this.getName().compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
