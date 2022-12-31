import java.util.Scanner;

public class AnalyzingExamResult {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int pass =0;
        int fail=0;
        int studentCounter=1;

        while (studentCounter<=10){
            System.out.print("Enter result(1 = pass, 2 =fail):");
            int result = input.nextInt();

            if (result == 1){pass +=1;}
            else{fail+=1;}
            studentCounter+=1;
        }
        System.out.printf("passed: %d%n failed:%d%n", pass,fail);
        if(pass >8){
            System.out.println("Bonus to instructor!");
        }
    }
}
