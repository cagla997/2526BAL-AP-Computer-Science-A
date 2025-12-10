// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Enter your GPA:");
		double gpa;
		gpa = enter.nextInt();
		
		System.out.println("Enter the number of your weak grades:");
		int weakGrade;
		weakGrade = enter.nextInt();
		
		if (weakGrade>0) {
			
			if (gpa>=50)
				System.out.println("Passed the class");
			
			else if (gpa>=25)
				System.out.println("Take GPA exam");
			
			else 
				System.out.println("Repeat the year");
			
		}
		
		else  {
			if (gpa>=85)
				System.out.println("Certificate of High Achievement");
			else if (gpa>=70)
				System.out.println("Certificate of Achievement");
			else if (gpa>=50)
				System.out.println("Passed the class");
			
		}
	}

}

    
