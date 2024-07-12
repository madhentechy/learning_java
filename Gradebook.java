import java.util.Scanner;

public class Gradebook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        String[] names = new String[numStudents];

        // Arrays to store 3 subject grades for each student
        int[][] mathGrades = new int[numStudents][1];
        int[][] englishGrades= new int[numStudents][1];
        int[][] tamilGrades = new int[numStudents][1];
        int[][]socialGrades= new int[numStudents][1];
        int[][] scienceGrades= new int[numStudents][1];

        // Final grade averages array
        double[] finalGrades = new double[numStudents];

        // Get student details input
        for(int i=0; i<numStudents; i++){

            System.out.print("Enter name: ");
            names[i] = sc.next();

            System.out.print("Enter math grade: ");
            mathGrades[i][0] = sc.nextInt();

            System.out.print("Enter english grade: ");
            englishGrades[i][0] = sc.nextInt();

            System.out.print("Enter tamil grade: ");
            tamilGrades[i][0] = sc.nextInt();

            System.out.print("Enter social grade: ");
            socialGrades[i][0]= sc.nextInt();

            System.out.print("Enter science grade: ");
            scienceGrades[i][0]= sc.nextInt();

            // Calculate final average grade
            int sum = mathGrades[i][0] + englishGrades[i][0] + tamilGrades[i][0]+socialGrades[i][0]+scienceGrades[i][0];
            finalGrades[i] = sum / 5.0;
        }
// Display student details
        System.out.println("\n*** Grade Report *** ");
        for(int i=0; i<numStudents; i++){

            System.out.println("Name: " + names[i]);

            System.out.println("Math Grade: " + mathGrades[i][0]);
            System.out.println("English Grade: " + englishGrades[i][0]);
            System.out.println("Tamil Grade: " + tamilGrades[i][0]);
            System.out.println("Social Grade: " + socialGrades[i][0]);
            System.out.println("Science Grade: " + scienceGrades[i][0]);

            System.out.println("Average Grade: " + finalGrades[i]);
            System.out.println();
        }

// Determine highest average grade
        double highestGrade = 0;
        String topper = "";
        for(int i=0; i<numStudents; i++){
            if(finalGrades[i] > highestGrade){
                highestGrade = finalGrades[i];
                topper = names[i];
            }
        }

        System.out.println("Student with highest average grade: " + topper);
        System.out.println("Highest average grade: " + highestGrade);
    }
}