import java.util.Random;

public class Task4{
    public static void main(String[] args){

        // initializing Random class
        Random random = new Random();

        // generating random odd number of bricks between 50 and 100
        int amountOfBricks = random.nextInt(25, 50) * 2 +1, 

        // generating random container capacity between 5 and 10 and multiplying it by 2 to make it even
        containerCapacity = random.nextInt(3, 5) * 2,

        // calculating number of full containers and remaining bricks
        fullContainers = amountOfBricks / containerCapacity,

        // calculating remaining bricks
        remainingBriks = amountOfBricks % containerCapacity;
        
        // determining the correct word for brick/bricks
        String word = "";
        if (remainingBriks == 1){word = " brick";}
        else{word = " bricks";}

        // printing the results
        System.out.println("We have " + fullContainers + " full containers and " + (fullContainers + 1) 
        + " in total\n as for the last container we have " + remainingBriks + word + " left");
    }
}