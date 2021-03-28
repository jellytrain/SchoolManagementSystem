package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Teacher Lizzy = new Teacher(1L,"Lizzy",500);
	    Teacher Mellisa = new Teacher(2L,"Mellisa",300);
	    Teacher Tomas = new Teacher(3L,"Tomas",900);

	    List<Teacher> teacherList = new ArrayList<>();
	    teacherList.add(Lizzy);
	    teacherList.add(Mellisa);
	    teacherList.add(Tomas);

	    Student Jonas = new Student(1L,"Jonas",2);
	    Student Giedrius = new Student(2L,"Giedrius",5);
	    Student Egle = new Student(3L,"Egle",8);

	    List<Student> studentList = new ArrayList<>();
	    studentList.add(Jonas);
	    studentList.add(Giedrius);
	    studentList.add(Egle);

	    School ghs = new School(teacherList,studentList);
        System.out.println("School has earned $" + ghs.getTotalMoneyEarned());

        Jonas.updateFessPaid(500);
		Giedrius.updateFessPaid(40000);
		System.out.println(ghs.getTotalMoneyEarned());

		System.out.println("----------MAKING SCHOOL PAY SALARY FOR TEACHERS----------");
		Lizzy.receiveSalaray(Lizzy.getSalary());
		System.out.println("School has spent for salary to " + Lizzy.getName() +
		" and now has " + ghs.getTotalMoneyEarned());

		Tomas.receiveSalaray(Tomas.getSalary());
		System.out.println("School has spent for salary " + Tomas.getName()
		+ " and now has $" + ghs.getTotalMoneyEarned());


		System.out.println(Jonas);

		Tomas.receiveSalaray(Tomas.getSalary());

		System.out.println(Tomas);
    }
}
