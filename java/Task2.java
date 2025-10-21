import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Initial variables declaration
        float MarsWeightTaha = 0.38F, EarthWeightTaha = 0.0F;
        double MarsWeightFinalTaha = 0.0D;

        // taking input from user 
        System.out.print("Enter your weight on Earth: ");
        Scanner input = new Scanner(System.in);
        EarthWeightTaha = input.nextFloat();
        input.close();

        // finale calculation and its output
        MarsWeightFinalTaha = EarthWeightTaha * MarsWeightTaha;
        System.out.printf("Your weight on Mars is: %.4f" , MarsWeightFinalTaha);

        // turning the variable of type double into int 
        int MarsWeightIntTaha = (int)MarsWeightFinalTaha;
        System.out.println("\nYour weight on Mars (as an integer) is: " + MarsWeightIntTaha);

        // turning the variable of type int into 
        char MarsWeightCharTaha = (char)MarsWeightIntTaha;  
        System.out.println("Your weight on Mars (as a character) is: " + MarsWeightCharTaha);

        // math operation on the char type variable
        int operationResultTaha = MarsWeightCharTaha + 5;
        System.out.println("Result after adding 5 to the character value: " + operationResultTaha);
    } 
}