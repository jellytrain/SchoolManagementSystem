package com.company;

/**
 * Keeping track of teachers name,id & salary.
 */

public class Teacher {
    private Long id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(Long id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return id.
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @return the name of teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return salary for teachers.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalaray(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "The teacher: " + name + " gets: " + salaryEarned + " of salary.";
    }
}
