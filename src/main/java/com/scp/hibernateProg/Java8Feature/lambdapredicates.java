package com.scp.hibernateProg.Java8Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class lambdapredicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Employee>l = new ArrayList<Employee>();
		
		l.add(new Employee(105, "sandee", "developer",50001));
		l.add(new Employee(104, "sachin", "developer",40000));
		l.add(new Employee(101, "sonali", "PM",70000));
		l.add(new Employee(106, "dinesh", "TL",60007));
		l.add(new Employee(102, "abhi", "developer",50000));
       // System.out.println("kkkk");
		//System.out.println(l);
		//l.stream().forEach(System.out::println);
		Comparator<Employee> c =(e1,e2)->e1.getEmpNm().compareTo(e2.getEmpNm());
		
		Collections.sort(l, c);
		/*l.stream().forEach(System.out::println);
		
		Predicate<Employee> p = (s)->s.getEmpSal()>50000;
		for (Employee e1 : l) {
			if (p.test(e1))
				System.out.println(e1.getEmpNm()+": "+e1.getEmpSal());
			
		}*/
		
		Predicate<Employee> p1 = (s)->s.getEmpSal()%2==0 && s.getEmpDsgn().equals("PM");
		/*for (Employee e1 : l) {
			if (p1.test(e1))
				System.out.println(e1.getEmpNm()+": "+e1.getEmpSal());
			
		}
		*/
		/*Predicate<Employee> p2 = (s)->s.getEmpId()==101;
		for (Employee e2 : l) {
			
			if (p1.and(p2).test(e2))
			{
				System.out.println(e2);
			}
			
		}*/
		
		Predicate<Employee> p2 = (s)->s.getEmpId()==101;
		for (Employee e2 : l) {
			
			if (p1.negate().test(e2))
				System.out.println(e2);
			
			
		}
	}

}
