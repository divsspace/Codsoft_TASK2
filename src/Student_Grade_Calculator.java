

import java.util.*;
import java.lang.*;
public class Student_Grade_Calculator {
    public static void main(String[] args) {
        System.out.println("ENTER STUDENT NAME");
        Scanner sc=new Scanner(System.in);
        String grade;
        //INPUT
        String name=sc.nextLine();
        System.out.println("ENTER MARKS:");
        System.out.print("MATHS: ");
        double m=sc.nextDouble();
        System.out.println();
        System.out.print("PHYSICS: ");
        double p=sc.nextDouble();
        System.out.println();
        System.out.print("CHEMISTRY: ");
        double c=sc.nextDouble();
        System.out.println();
        System.out.print("BIOLOGY: ");
        double b=sc.nextDouble();
        System.out.println();
        System.out.print("ENGLISH: ");
        double e=sc.nextDouble();
        System.out.println();
        System.out.print("COMPUTER SCIENCE: ");
        double cs=sc.nextDouble();
        System.out.println();
        System.out.print("HISTORY: ");
        double h=sc.nextDouble();
        System.out.println();
        //INPUT END

        //CALCULATE TOTAL MARKS
        double total=m+p+c+b+e+cs+h;

        //CALCULATE AVERAGE PERCENTAGE
        double average=total/7;

        ///GRADE CALCULATION
        if(average>=90&&average<=100)
            grade = "O";
        else if(average>=80&&average<=90)
            grade = "A";
        else if(average>=70&&average<=80)
            grade = "B";
        else if(average>=60&&average<=70)
            grade = "C";
        else if(average>=50&&average<=60)
            grade = "D";
        else if(average>=40&&average<=50)
            grade = "E";
        else
            grade = "F";

        //DISPLAY RESULTS
        System.out.println("                      RESULT                 ");
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Average Percentage : " + average+ "%");
        System.out.println("Grade Received : " + grade);

    }
}
