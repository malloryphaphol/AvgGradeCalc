import java.util.*;

// Name: Mallory Phaphol
// Class: CS 3305/Section03
// Term: Spring 2025
// Instructor: Umama Tasnim
public class AverageGradeMalloryPhaphol {
    static double computeAverage (int[] grade,int spot, int sum){
        if (spot == grade.length) {
            return (double) sum/grade.length;
        }
        sum += grade[spot];
        return computeAverage(grade, spot+1, sum);
    }
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int grades;
        int[] studentGrades;
        double gradeAverage;
        System.out.println("Grades: ");
        grades = scan.nextInt();
        System.out.println("Entered grades: ");
        studentGrades = new int[]{scan.nextInt()};
        gradeAverage = computeAverage(studentGrades, 0,0);
        System.out.print("Grade average: " + gradeAverage);
    }
}
