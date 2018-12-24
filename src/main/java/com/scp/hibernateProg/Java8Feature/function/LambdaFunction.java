package com.scp.hibernateProg.Java8Feature.function;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunction {

	public static void main(String[] args) {
		Function<Stud, String>f=s->{
			double marks=s.getMarks();
			String grade="";
			if(marks>=80)grade=" A";
			else if(marks>=60)grade="B";
			else grade="fail";
			return grade;
		};
		
		Stud[]s={new Stud(111, "sona", 87),
				new Stud(222, "sandy", 50),
				new Stud(555, "ankit", 30)
				
		};
		Predicate<Integer> p=m->m>60;
		for (Stud s1 : s) {
			if (p.test((int) s1.getMarks()))
			{
			System.out.println("name"+s1.getName());
			System.out.println("marks"+s1.getMarks());
			System.out.println("grade"+f.apply(s1));
			}
			
		}
		
		
		
		
	}
}
