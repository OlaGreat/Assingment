import java.util.Scanner;

public class ClassAverage2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total =0;
        int scoreCounter =0;
        System.out.print("Enter Score or -1 to quit:");
        int score = input.nextInt();

        while (score!=-1){
            total+=score;
            scoreCounter = scoreCounter +1;
            System.out.print("Enter score or -1 to quit:");
            score = input.nextInt();
        }
        if (scoreCounter!=0){
            double average = (double) total/scoreCounter;
            System.out.printf("%nTotal of all the %d score entered is %d%n", scoreCounter,total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else{
            System.out.println("no score entered");
        }

    }
}
