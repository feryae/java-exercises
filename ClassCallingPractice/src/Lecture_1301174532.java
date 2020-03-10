/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkm_pondoksalam
 */
public class Lecture_1301174532 {

    public Lecture_1301174532(String name_1301174532, int credit_1301174532, int maxStudent) {
        this.name_1301174532 = name_1301174532;
        this.credit_1301174532 = credit_1301174532;
        this.maxStudent = maxStudent;
    }
    private String name_1301174532;
    private int credit_1301174532;
    private int maxStudent;
    private Lecturer_1301174532 lecturer;
    private Student_1301174532[] student;

    /**
     * @return the name_1301174532
     */
    public String getName_1301174532() {
        return name_1301174532;
    }

    /**
     * @return the lecturer
     */
    public Lecturer_1301174532 getLecturer() {
        return lecturer;
    }

    /**
     * @param name_1301174532 the name_1301174532 to set
     */
    public void setName_1301174532(String name_1301174532) {
        this.name_1301174532 = name_1301174532;
    }

    /**
     * @param lecturer the lecturer to set
     */
    public void setLecturer(Lecturer_1301174532 lecturer) {
        this.lecturer = lecturer;
    }

    /**
     * @return the credit_1301174532
     */
    public int getCredit_1301174532() {
        return credit_1301174532;
    }

    /**
     * @return the maxStudent
     */
    public int getMaxStudent() {
        return maxStudent;
    }

    /**
     * @return the student
     */
    public Student_1301174532[] getStudent() {
        return student;
    }

    /**
     * @param credit_1301174532 the credit_1301174532 to set
     */
    public void setCredit_1301174532(int credit_1301174532) {
        this.credit_1301174532 = credit_1301174532;
    }

    /**
     * @param maxStudent the maxStudent to set
     */
    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student_1301174532[] student) {
        this.student = student;
    }
    
        public void addStudent_1301174532(Student_1301174532 student){
        int i = 0;
        while ((this.student[i] != null)&& (i <= this.student.length)){
            i++;
        }
        this.student[i] = student;
    }

    
}
