package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("The studentName is Arvind");

	}
	public void studentDept() {
		System.out.println("The studentDept is Mech");

	}
	public void studentId() {
		System.out.println("The studentId is 112");

	}
	public static void main(String[] args) {
		Student su =new Student();
		su.collegeName();
		su.collegeCode();
		su.collegeRank();
		su.deptName();
		su.studentDept();
		su.studentId();
		su.studentName(); 
	}
}
