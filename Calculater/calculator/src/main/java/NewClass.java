/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class NewClass {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        if (numStudents <= 0) {
            System.out.println("No students to grade.");
            return;
        }

        // Initialize variables to keep track of the best score and student grades
        int bestScore = -1;
        int[] studentGrades = new int[numStudents];

        // Get scores from the user
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the score for student " + i + ": ");
            int score = scanner.nextInt();
            studentGrades[i] = score;

            // Update the best score
            if (score > bestScore) {
                bestScore = score;
            }
        }

        // Determine grades and display the results
        for (int i = 0; i < numStudents; i++) {
            int score = studentGrades[i];
            char grade;

            if (score >= bestScore - 10) {
                grade = 'A';
            } else if (score >= bestScore - 20) {
                grade = 'B';
            } else if (score >= bestScore - 30) {
                grade = 'C';
            } else if (score >= bestScore - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Student " + i + " score is " + score + " and grade is " + grade);
        }
    }
}


