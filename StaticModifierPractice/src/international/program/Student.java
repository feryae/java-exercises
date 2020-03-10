/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package international.program;

/**
 *
 * @author pkm_pondoksalam
 */
public class Student {
    //Attribute
    String name;
    long studentID;
    private double grade;
    
    //Method
    void printStudentData(){
        System.out.println("Name :"+name);
        System.out.println("ID : "+studentID);
        System.out.println("Grade : "+grade);
        
        
    }
    public void setname(String name){
        this.name = name;
    }
    public void setstudentID(long studentID){
        this.studentID = studentID;
    }
    double getgrade(){
        return grade;
    }
    public String getname(){
        return name;
    }
    
    void calculateGrade(int totalScore, int totalCredit){
        grade = totalScore/totalCredit;
    }
}
