package programs;
import java.util.Scanner;


public class multidime {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);	
		int students;
		String name[] = new String [4];
		int marks [] [] = new int [4] [4];
		int roll [] = new int [4];
		int total [] = new int[4];
		char grade[] = new char [4];
		float average [] = new float [4];
		char result[] = new char [4];
		
		
		for (int i =0; i < 4; i++)
		{
			System.out.println("Enter your roll number: ");
					roll [i] = in.nextInt();
			System.out.println("Enter the student name: ");
			      name [i] = in.next();
		    System.out.print("Enter the 3 marks: ");
				for (int j = 0; j < 3; j++) 
			{     
				marks[i][j] = in.nextInt();
				total[i]+= marks[i][j];
				average[i] = total[i]/3;
				
		if( total[i] > 50) {result[i] = 'P';}
		else {result[i] = 'F';}		
		
		if (average[i] >= 70) {grade[i] = 'A';}
		else if (average[i] >= 50 && average[i] < 69) {grade[i] = 'B';}
		else {grade[i] = 'C';}
			}
			 System.out.println("Your total is: "+total[i]);
			 System.out.println("Your average is: "+average[i]);
			 System.out.println("");
			 }
		   System.out.println("");
	       System.out.println("**************************************************************************");
	       System.out.println("\t\t\t STUDENT MARKLIST\t\t");
	       System.out.println("**************************************************************************");
	       System.out.println("ROLL\t NAME\t MARK1\t MARK2\t MARK3\t TOTAL\t RESULT\t Average GRADE\t ");
	       System.out.println(""+roll[0]+ "\t "+name[0]+ " \t "+marks[0][0]+ "\t "+marks[0][1]+ "\t"+marks[0][2]+ "\t "+total[0]+ " \t"+result[0]+ "\t"+average[0]+ " \t" +grade[0]);
	       System.out.println(""+roll[1]+ "\t "+name[1]+ " \t "+marks[1][0]+ "\t "+marks[1][1]+ "\t"+marks[1][2]+ "\t "+total[1]+ " \t"+result[1]+ "\t"+average[1]+ " \t" +grade[1]);
	       System.out.println(""+roll[2]+ "\t "+name[2]+ " \t "+marks[2][0]+ "\t "+marks[2][1]+ "\t"+marks[2][2]+ "\t "+total[2]+ " \t"+result[2]+ "\t"+average[2]+ " \t" +grade[2]);
	       System.out.println(""+roll[3]+ "\t "+name[3]+ " \t "+marks[3][0]+ "\t "+marks[3][1]+ "\t"+marks[3][2]+ "\t "+total[3]+ " \t"+result[3]+ "\t"+average[3]+ " \t" +grade[3]);
	       
	}	
}

