package com.scp.hibernateProg.Java8Feature;

public class Employee {

	    private int empId;
	    private String empNm;
	    private String  empDsgn;
	    private double empSal;
	    
	    
		public Employee(int empId, String empNm, String empDsgn, double empSal) {
			super();
			this.empId = empId;
			this.empNm = empNm;
			this.empDsgn = empDsgn;
			this.empSal = empSal;
		}
		public int getEmpId() {
			System.out.println("AAA");
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpNm() {
			return empNm;
		}
		public void setEmpNm(String empNm) {
			this.empNm = empNm;
		}
		public String getEmpDsgn() {
			return empDsgn;
		}
		public void setEmpDsgn(String empDsgn) {
			this.empDsgn = empDsgn;
		}
		public double getEmpSal() {
			return empSal;
		}
		public void setEmpSal(double empSal) {
			this.empSal = empSal;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empNm=" + empNm + ", empDsgn=" + empDsgn + ", empSal=" + empSal
					+ "]";
		}
}
