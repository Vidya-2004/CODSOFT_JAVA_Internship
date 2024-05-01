// Task 02 -> Student_Grade_Calc

import java.util.*;
public class Task_02_Student_Grade_Calc {

    public static char GradeAssign(double percentage){
        if(percentage >= 80.0){
            return 'A';
        }else if(percentage >= 70.0 && percentage < 80.0){
            return 'B';
        }else if(percentage >= 60.0 && percentage < 70.0){
            return 'C';
        }else if(percentage >= 50.0 && percentage < 60.0){
            return 'D';
        }else if(percentage >= 40.0 && percentage < 50.0){
            return 'E';
        }else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        int subMarks[] = new int[5];
        String subject[] = {"English" , "Mathematics" , "Computer" , "DSA" , "Physical Edu."};

        int totalMarks = 0 ;
        double percentage = 0.0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < subject.length; i++) {
            System.out.println("Enter the marks(out of 100) for "+subject[i]+" : ");
            subMarks[i] = sc.nextInt();
            totalMarks+=subMarks[i];
        }
        percentage = totalMarks/5;

        char grade = GradeAssign(percentage);

        // Display Result
        System.out.println(">>>    RESULT    <<<");
        System.out.println("Total Marks ::   "+totalMarks);
        System.out.println("Percentage  ::   "+percentage);
        System.out.println("Grade       ::   "+grade);

        sc.close();
    }
}
