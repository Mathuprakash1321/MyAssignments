package org.student;


import org.department.Department;

public class Student extends Department{

	
		// studentName(),studentDept(),studentId()
		
	public void studentName() {
		System.out.println("c-studentName");
		}
	public void studentDept() {
		System.out.println("c-studentDept");
		}
	public void studentId() {
		System.out.println("c-studentId");
		}
	
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
		
	}
		

}
