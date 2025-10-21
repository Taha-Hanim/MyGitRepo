import java.util.Random;

public class Task3 {
    public static void main(String[] args){

        // initializing Random class
        Random random = new Random();

        // generating random integers from 1 to 100 and printing it 
        int RandomNumnber = random.nextInt(1, 100);
        System.out.println("Generated Random Number: " + RandomNumnber);

        // checking even or odd number
        int CheckEvenOdd = RandomNumnber % 2;
        if (CheckEvenOdd == 0){
            System.out.println(RandomNumnber + " is an Even Number");
        }
        else{
            System.out.println(RandomNumnber + " is an Odd Number");
        }
    }
}