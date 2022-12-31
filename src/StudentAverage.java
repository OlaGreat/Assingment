import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int gradecounter =1;


        while (gradecounter<=10){
            System.out.println("Enter grade");
            int grade = input.nextInt();

            if (grade >100){
                System.out.println("garde is invalid");}
            else {
                total+=grade;
            }
            //if (grade!=100) System.out.println("Enter grade betwen 0-100");

            gradecounter+=1;
        }
        double average= total/ 10;

        System.out.printf("Total grade is = %.2f%n", total);
        System.out.printf("The average grade is = %.2f%n", average);


    }
}


