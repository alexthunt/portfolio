package lab12;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab12 {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How high of a number do you want to calculate prime numbers for?");
        int maximumNumber = 1;
        boolean successfulStringConversionForNumber = false;
        while (!(successfulStringConversionForNumber)) {
            try {
                maximumNumber = Integer.parseInt(keyboard.nextLine());
                successfulStringConversionForNumber = true;
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Try again.");
            }
        }
        System.out.println("How many threads do you want to use?");
        int maximumThreads = 1;
        boolean successfulStringConversionForThreads = false;
        while (!(successfulStringConversionForThreads)) {
            try {
                maximumThreads = Integer.parseInt(keyboard.nextLine());
                successfulStringConversionForThreads = true;
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Try again.");
            }
        }
        int endValue = (maximumNumber / maximumThreads);

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/
 /*---------------------------------------------------------------------------------------------------------------------------------------------*/
        ArrayList<ThreadExample> threads = new ArrayList<>();
        for (int startValue = 1; startValue < maximumNumber; startValue += endValue) {
            ThreadExample primeCounterThread = new ThreadExample(startValue, startValue + endValue - 1);
            primeCounterThread.start();
            threads.add(primeCounterThread);
        }

        int totalPrimes = 0;

        try {
            for (ThreadExample thread : threads) {
                thread.join();
                totalPrimes += thread.getPrimeCount();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("There are " + (totalPrimes-1) + " total primes.");
    }
}
