package Pract;

public class GradeCalc {
	public static void main(String[] args) {	
   int marks = 90;
   
   String grade = (marks >= 90)? "A++": (marks >= 80)? "A": (marks >=70)? "B+": (marks >= 60)? "B": 
    	(marks>= 50)? "C+": "F";
   
   System.out.println("Marks: "+ marks);
   System.out.println("Grade: "+ grade);
	}
}
