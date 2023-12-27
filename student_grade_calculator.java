//SPPU GRADE SYSTEM.
import java.util.*;

public class student_grade_calculator {
    
   public static void main(String[] args)

   {
     float [] marks = new float[5];
      float sum=0, avg;
      int i;
      Scanner scan = new Scanner(System.in);
     {
      System.out.println("Enter Marks Obtained in 5 Subjects: ");
      for(i=0; i<5; i++)
         marks[i] = scan.nextFloat();
      
      for(i=0; i<5; i++)
         sum = sum + marks[i];
      avg = sum/5;
      
      System.out.print("\nGrade = ");
	  
      if(avg>91)
         System.out.println("O");
      else if(avg>81 && avg<=90)
         System.out.println("A");
      else if(avg>71 && avg<=80)   
         System.out.println("B");
     else if(avg>61 && avg<=70) 
         System.out.println("C");
     else if(avg>51 && avg<=60) 
         System.out.println("D");
     else if(avg>41 && avg<=50) 
         System.out.println("E");     
     else
         System.out.println("F");
     }
    }
}