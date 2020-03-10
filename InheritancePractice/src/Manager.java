/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */
public class Manager extends Employee{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Fae");
        m.setSalary(1000);
        System.out.println("Name : "+m.getName());
        System.out.println("Salary : "+m.getSalary());
        Labour l = new Labour();
        l.setName("Rodi");
        l.setSalary(500);
        l.setDay(7);
        System.out.println("Name = "+l.getName());
        System.out.println("Salary = "+l.getSalary());
        System.out.println("Day = "+l.getDay());
    }
}
