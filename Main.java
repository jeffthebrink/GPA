import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    // user inputs grade to be returned
    static char enterGrade() {
        String input;
        System.out.println("Please enter your grade using A, B, C, or F");
        input = Main.scanner.nextLine();
        return input.toLowerCase().charAt(0);
    }

    public static void main(String[] args) {
        float gradePointAverage = 0;
        char firstGrade;
        char secondGrade;
        char thirdGrade;
        char fourthGrade;
        char fifthGrade;
        float finalGPA;

        System.out.println("Hello, welcome to the grade point average calculator. You will enter 5 grades to be converted to your final GPA.");

        firstGrade = enterGrade();

        if (firstGrade == 'a') {
            gradePointAverage = gradePointAverage + 4;
        } else if ((firstGrade == 'b')) {
            gradePointAverage = gradePointAverage + 3;
        } else if ((firstGrade == 'c')) {
            gradePointAverage = gradePointAverage + 2;
        } else if ((firstGrade == 'f')) {
            gradePointAverage = gradePointAverage + 1;
        }


        //System.out.println("Please enter your second grade using A, B, C, or F");
        secondGrade = enterGrade();


        if ((secondGrade == 'a')) {
            gradePointAverage = gradePointAverage + 4;
        } else if ((secondGrade == 'b')) {
            gradePointAverage = gradePointAverage + 3;
        } else if ((secondGrade == 'c')) {
            gradePointAverage = gradePointAverage + 2;
        } else if ((secondGrade == 'f')) {
            gradePointAverage = gradePointAverage + 1;
        }

        //System.out.println("Please enter your third grade using A, B, C, or F");
        thirdGrade = enterGrade();

        if ((thirdGrade == 'a')) {
            gradePointAverage = gradePointAverage + 4;
        } else if ((thirdGrade == 'b')) {
            gradePointAverage = gradePointAverage + 3;
        } else if ((thirdGrade == 'c')) {
            gradePointAverage = gradePointAverage + 2;
        } else if ((thirdGrade == 'f')) {
            gradePointAverage = gradePointAverage + 1;
        }

        //System.out.println("Please enter your fourth grade using A, B, C, or F");
        fourthGrade = enterGrade();

        if ((fourthGrade == 'a')) {
            gradePointAverage = gradePointAverage + 4;
        } else if ((fourthGrade == 'b')) {
            gradePointAverage = gradePointAverage + 3;
        } else if ((fourthGrade == 'c')) {
            gradePointAverage = gradePointAverage + 2;
        } else if ((fourthGrade == 'f')) {
            gradePointAverage = gradePointAverage + 1;
        }

        //System.out.println("Please enter your fifth grade using A, B, C, or F");
        fifthGrade = enterGrade();

        if ((fifthGrade == 'a')) {
            gradePointAverage = gradePointAverage + 4;
        } else if ((fifthGrade == 'b')) {
            gradePointAverage = gradePointAverage + 3;
        } else if ((fifthGrade == 'c')) {
            gradePointAverage = gradePointAverage + 2;
        } else if ((fifthGrade == 'f')) {
            gradePointAverage = gradePointAverage + 1;
        }

        System.out.println("Your grades you've input are: " + firstGrade + " " + secondGrade + " " + thirdGrade + " " + fourthGrade + " " + fifthGrade);

        //System.out.println(gradePointAverage);
        finalGPA = gradePointAverage / 5;

        System.out.println("Your final GPA is: " + finalGPA);


    }
}
