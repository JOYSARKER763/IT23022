import java.util.Random;
import java.time.Instant;

public class CustomRandomGenerator {
    private static final int[] seedArray = {3, 7, 11, 19, 23, 29, 31, 37, 41, 43}; 
    private static final int MODULO = 100; 
    
    public static void myRand(int n) {
        Random random = new Random(Instant.now().toEpochMilli()); 
        System.out.println("Generating " + n + " random numbers:");
        
        for (int i = 0; i < n; i++) {
            int randIndex = random.nextInt(seedArray.length); 
            int randNumber = (seedArray[randIndex] * (int) Instant.now().toEpochMilli()) % MODULO; 
            
            System.out.println(randNumber);
            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
    public static int myRand() {
        Random random = new Random(Instant.now().toEpochMilli());
        int randIndex = random.nextInt(seedArray.length);
        return (seedArray[randIndex] * (int) Instant.now().toEpochMilli()) % MODULO;
    }

   
    public static int myRand(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value must be less than Max value.");
        }
        Random random = new Random(Instant.now().toEpochMilli());
        return random.nextInt((max - min) + 1) + min;
    }

  
    public static void main(String[] args) {
        
        myRand(5);

       
        System.out.println("\nSingle Random Number: " + myRand());

     
        System.out.println("\nRandom Number between 100 and 500: " + myRand(100, 500));
    }
}

