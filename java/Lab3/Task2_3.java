import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {

        float heightTaha, weightTaha, bmiTaha;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter height in cm: ");
        
        heightTaha = scanner.nextFloat();
        
        System.out.print("Enter weight in kilograms: ");
        
        weightTaha = scanner.nextFloat();
        scanner.close();
        
        bmiTaha = weightTaha / ((float)Math.pow(heightTaha * 0.01, 2));
        
        if (bmiTaha < 16.00f) {System.out.print("starvation");} 
        else if (bmiTaha >= 16.00f && bmiTaha <= 16.99f) {System.out.print("emaciation");} 
        else if (bmiTaha >= 17.00f && bmiTaha <= 18.49f) {System.out.print("underweight");} 
        else if (bmiTaha >= 18.50f && bmiTaha <= 24.99f) {System.out.print("normal weight");} 
        else if (bmiTaha >= 25.00f && bmiTaha <= 29.99f){System.out.print("overweight");} 
        else if (bmiTaha >= 30.00f && bmiTaha <= 34.99f){ System.out.print("1st degree obesity");} 
        else if (bmiTaha >= 35.00f && bmiTaha <= 39.99f){System.out.print("2nd degree obesity");} 
        else {System.out.print("3rd degree obesity");}
    }
}
