package com.scp.hibernateProg.Java8Feature.function;

public class Stud {
	private int rollno;
	private String name;
	private double marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	public Stud(int rollno, String name, double marks) {
		
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	
	

}
