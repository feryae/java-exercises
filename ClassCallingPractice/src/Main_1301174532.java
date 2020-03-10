/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */
public class Main_1301174532 {
    
    void display(){
        
       
    }
    public static void main(String[] args) {
        Lecturer_1301174532 LC1_1301174532 = new Lecturer_1301174532("Max Steel","MXS");
    Lecture_1301174532 L1_1301174532 = new Lecture_1301174532("Calculus",45,3);
    Student_1301174532 S1_1301174532 = new Student_1301174532("Bobby",12341);
    Student_1301174532 S2_1301174532 = new Student_1301174532("Suzy",12342);
    Student_1301174532 S3_1301174532 = new Student_1301174532("Andrew",12343);
    Student_1301174532 S4_1301174532 = new Student_1301174532("Briant",12344);
    Student_1301174532 S5_1301174532 = new Student_1301174532("Coby",12345);
    
        Student_1301174532 [] ArrStu = new Student_1301174532[10];
        System.out.println("Lecturer : ");
        System.out.println("+ Name : "+LC1_1301174532.getName_1301174532());
        System.out.println("+ Code : "+LC1_1301174532.getCode_1301174532());
        System.out.println("Lecture : ");
        System.out.println("+ Name : "+L1_1301174532.getName_1301174532());
        System.out.println("+ Max Student : "+L1_1301174532.getMaxStudent());
        System.out.println("+ Credit : "+L1_1301174532.getCredit_1301174532());
        System.out.println("Student : ");
        L1_1301174532.setStudent(ArrStu);
        L1_1301174532.addStudent_1301174532(S1_1301174532);
        L1_1301174532.addStudent_1301174532(S2_1301174532);
        L1_1301174532.addStudent_1301174532(S3_1301174532);
        L1_1301174532.addStudent_1301174532(S4_1301174532);
        L1_1301174532.addStudent_1301174532(S5_1301174532);
        
        int i = 0;
        while ((ArrStu[i] != null)&& (i <= ArrStu.length)){
            System.out.println("+ Student "+ (i+1) +" :");
            System.out.println("- Name : "+ArrStu[i].getName_1301174532());
            System.out.println("- ID : "+ArrStu[i].getIdStudent_1301174532());
            i++;
        }
    }
}