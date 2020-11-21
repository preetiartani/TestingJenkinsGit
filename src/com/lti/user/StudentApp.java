package com.lti.user;

import com.lti.entity.*;

class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStuId(101);
		s1.setStuName("Vijay");
		s1.setStuFees(8000);
		System.out.println(s1.getStuId());
		System.out.println(s1.getStuName());
		System.out.println(s1.getStuFees());
		System.out.println(s1);
	}
}
