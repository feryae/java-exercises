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
public class Main {
    private static Student s1;
    public static void main(String[] args) {
        s1 = new Student();
        s1.name = "Akira";
        s1.studentID = 1301174532;
        s1.calculateGrade(4, 1);
        s1.getgrade();
        s1.printStudentData();
    }
}
