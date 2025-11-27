import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {

        float firstNumber, secondNumber;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        
        firstNumber = scanner.nextFloat();
        
        System.out.print("Enter second number: ");
        
        secondNumber = scanner.nextFloat();
        scanner.close();
        
        System.out.print(" The sum is: " + (firstNumber + secondNumber) + "\n The Difference is: " + (firstNumber - secondNumber) +
                "\n The Product is: " + (firstNumber * secondNumber) + "\n The Quotient is: " + (firstNumber / secondNumber));
    }
}
