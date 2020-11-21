package com.lti.entity;

class Student {
	int stuId;
	String stuName;
	double stuFees;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public double getStuFees() {
		return stuFees;
	}
	public void setStuFees(double stuFees) {
		this.stuFees = stuFees;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuFees=" + stuFees + "]";
	}
	
	
}
