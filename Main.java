import java.util.*;
class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char again;
        System.out.println("Welcome to Student Tracker program! \n");
         do {
             // ask teacher to identify the number of students
             System.out.println("Please enter the number of students: ");
             int numberOfStudents = input.nextInt();
             StudentsClasses obj = new StudentsClasses(numberOfStudents);
             obj.insertGrades();
             // to repeat the program
             System.out.println("\n Do you want to add grades for another class? (Y/N)");
             again = input.next().charAt(0);
         }
         while (again == 'y' || again =='Y');
    }
}
