import java.util.*;
public class StudentsClasses {
    int numberOfStudents ;
    public StudentsClasses(int x){
        numberOfStudents = x;
    }
    Scanner input = new Scanner(System.in);
    public void insertGrades (){
        //fill the array list with students grads and calculate the sum of all grades
        ArrayList <Double> studentsGrads= new ArrayList<>(numberOfStudents);
        double grades ;
        double sum = 0;
        for(int i=0;i<numberOfStudents; i++){
            System.out.println("please enter the grades of student number " + (1+i) +": ");
            grades = input.nextDouble();
            sum += grades;
            studentsGrads.add(i,grades);
        }
        // calculate the highest and lowest scores using for loop
    /*  double max = studentsGrads.get(0);
        double min = studentsGrads.get(0);
        for(int i=0;i<numberOfStudents; i++){
            if (studentsGrads.get(i) > max){ max= studentsGrads.get(i);}
            if (studentsGrads.get(i) < min){ min= studentsGrads.get(i);}
        } */
        // calculate the average,highest and lowest scores
        double avg = sum/numberOfStudents;
        double max = Collections.max(studentsGrads);
        double min = Collections.min(studentsGrads);
        //print results
        System.out.println("The average scores in this class is: "+ avg);
        System.out.println("The highest scores in this class is: "+ max);
        System.out.println("The lowest scores in this class is: "+ min);
    }
}

