package com;
import java.util.*;

public class GradeSystemSimple {
	
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number of students");
int n = sc.nextInt();
sc.nextLine(); 
    String[] name = new String[n];
    int[] marks = new int[n];

    for (int i = 0; i < n; i++) {
        System.out.println("ENTER NAME OF STUDENT " + (i + 1) + ":");
        name[i] = sc.nextLine();
        System.out.println("ENTER TOTAL MARKS (OUT OF 100):");
        marks[i] = sc.nextInt();
        sc.nextLine(); // consume newline after integer
    }

    System.out.println("\n--- GRADE REPORT ---");
    for (int i = 0; i < n; i++) {
        char grade;
        if (marks[i] >= 90) grade = 'A';
        else if (marks[i] >= 75) grade = 'B';
        else if (marks[i] >= 60) grade = 'C';
        else if (marks[i] >= 40) grade = 'D';
        else grade = 'F';

        System.out.println(name[i] + " - Marks: " + marks[i] + " - Grade: " + grade);
    }
}


}
