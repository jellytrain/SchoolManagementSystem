package com.company;

/**
 * This class is responsible for students.
 * fees, name, grade, fess paid & total fees.
 */

public class Student {
    private  Long id;
    private String name;
    private int grade;
    private int feesPaid;
    private int fessTotal;

    /**
     * fees total is 30,000
     * fess paid initially is 0.
     * @param id: unique id of the student
     * @param name: name of the student
     * @param grade: his grade
     */
    public Student(Long id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.fessTotal = 30000;
    }

    //no altering students name and id.

    /**
     *
     * @param grade setting the grade for student.
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding fees to feesPaid field.
     * Add the fess to the fess paid.
     * The school receiving funds.
     *
     * @param fees: fees that the student has paid.
     */
    public void updateFessPaid(int fees){
        feesPaid+=fees;
    }
}
