/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no71;

/**
 *
 * @author pkm_pondoksalam
 */
public class Student {

    private String name;
        private long studentID;
        private boolean isMale;
        private double grade;

        public String getName() {
            return name;
        }

        public long getStudentID() {
            return studentID;
        }

        public boolean isIsMale() {
            return isMale;
        }

        public double getGrade() {
            return grade;
        }
        
        public void setName(String name) {
            if (name != null){
                this.name = name;
            }
        }
        
        public void setStudentID(long studentID) {
            if(studentID > 99999){
                this.studentID = studentID;
            }
        }
        
        public void setIsMale(boolean isMale) {
            this.isMale = isMale;
            this.isMale = true;
        }

        public void setGrade(double grade) {
            if ((grade >= 0) && (grade <= 4)){
                this.grade = grade;
            }
        }
        public Student(String name, long studentID, boolean isMale, double grade) {
            this.name = name;
            this.studentID = studentID;
            this.isMale = isMale;
            this.grade = grade;
        }
        public Student(String name, long studentID, boolean isMale) {
            this.name = name;
            this.studentID = studentID;
            this.isMale = isMale;
        }
        public Student(String name, long studentID) {
            this.name = name;
            this.studentID = studentID;
        }
        public void display() {
        System.out.println("Name :"+name);
        System.out.println("StudentID: "+studentID);

        if(isMale) {
            System.out.println("Sex: Male");
        } else {
            System.out.println("Sex: Female");
        }
            System.out.println("Grade: "+grade);
        }

        public static void main(String[] args) {
            Student s1 = new Student("Max",321032,true,3.7);
            Student s2 = new Student("Anny",23331,true);
            Student s3 = new Student("Bobby",22122);
            System.out.println("Student 1");
            s1.display();
            System.out.println("Student 2");
            s2.display();
            System.out.println("Student 3");
            s3.display();
        }
}
