// Program to sc marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade
package control_flow;
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int physics = sc.nextInt();
		int  chemistry= sc.nextInt();
		int maths = sc.nextInt();
		float averageMarks = (physics+chemistry+maths)/3;
		String remarks  = "";
		char grade = ' ';
		if(averageMarks >= 80) {
			grade = 'A';
			remarks = "Level 4, above agency-normalized standards";
		}else if(averageMarks >= 70 && averageMarks <=79) {
			grade = 'B';
			remarks = "Level 3, at agency-normalized standards";
		}else if(averageMarks >= 60 && averageMarks <=69) {
			grade = 'C';
			remarks = "Level 2, below, but approaching agency-normalized standards";
		}else if(averageMarks >= 50 && averageMarks <=59) {
			grade = 'D';
			remarks = "Level 1, well below agency-normalized standards";
		}else if(averageMarks >= 40 && averageMarks <=49) {
			grade = 'B';
			remarks = "Level 1-, too below agency-normalized standards";
		}else {
			grade = 'R';
			remarks = "Remedial Standards";
		}
		System.out.println("Average Marks: "+averageMarks+"; Grade: "+grade+"; Remarks:"+remarks);
	    sc.close();
    }
}
