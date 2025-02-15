import java.util.Random;
import java.time.Instant;

public class CustomRandomGenerator {
    private static final int[] seedArray = {3, 7, 11, 19, 23, 29, 31, 37, 41, 43}; // নির্দিষ্ট অ্যারে
    private static final int MODULO = 100; // Modulo মান নির্ধারণ করা হয়েছে

    // ✅ 1️⃣ n টি র্যান্ডম সংখ্যা তৈরি করা (Formula ব্যবহার করে)
    public static void myRand(int n) {
        Random random = new Random(Instant.now().toEpochMilli()); // Timestamp ব্যবহার করে Seed সেট করা
        System.out.println("Generating " + n + " random numbers:");
        
        for (int i = 0; i < n; i++) {
            int randIndex = random.nextInt(seedArray.length); // Random index নিতে হবে
            int randNumber = (seedArray[randIndex] * (int) Instant.now().toEpochMilli()) % MODULO; // মূল ফর্মুলা
            
            System.out.println(randNumber);
            try {
                Thread.sleep(10); // সময়ের উপর নির্ভরতা বাড়ানোর জন্য সামান্য বিলম্ব (Sleep)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // ✅ 2️⃣ একটি মাত্র র্যান্ডম সংখ্যা রিটার্ন করা (Overloaded Method)
    public static int myRand() {
        Random random = new Random(Instant.now().toEpochMilli());
        int randIndex = random.nextInt(seedArray.length);
        return (seedArray[randIndex] * (int) Instant.now().toEpochMilli()) % MODULO;
    }

    // ✅ 3️⃣ নির্দিষ্ট রেঞ্জের (min-max) মধ্যে র্যান্ডম সংখ্যা তৈরি করা (Overloaded Method)
    public static int myRand(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value must be less than Max value.");
        }
        Random random = new Random(Instant.now().toEpochMilli());
        return random.nextInt((max - min) + 1) + min;
    }

    // ✅ 4️⃣ `main()` মেথডে `myRand(n)` কল করে ডেমো দেখানো
    public static void main(String[] args) {
        // `myRand(n)` মেথড ব্যবহার করে ৫টি র্যান্ডম সংখ্যা জেনারেট করা
        myRand(5);

        // Overloaded `myRand()` ব্যবহার করে একটি র্যান্ডম সংখ্যা প্রিন্ট করা
        System.out.println("\nSingle Random Number: " + myRand());

        // Overloaded `myRand(min, max)` ব্যবহার করে ১০০-৫০০ রেঞ্জের র্যান্ডম সংখ্যা প্রিন্ট করা
        System.out.println("\nRandom Number between 100 and 500: " + myRand(100, 500));
    }
}

