import java.util.Arrays;
import java.util.Random;

public class lambdaFile {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] randNumbers = rand.ints(10, 1, 101).toArray();
        
        System.out.print("our array is: ");
        Arrays.stream(randNumbers).forEach(element -> System.out.print(element + " "));
        System.out.print("\n");
        
        int mini = Arrays.stream(randNumbers).min().getAsInt();
        int max = Arrays.stream(randNumbers).max().getAsInt();
        
        System.out.println("minimal valeu: " + mini);
        System.out.println("maximal value: " + max);
    }
}