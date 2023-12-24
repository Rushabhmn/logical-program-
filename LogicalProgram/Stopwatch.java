package LogicalProgram;

public class Stopwatch {

    private static long startTime;
    private static long endTime;

    public static void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started...");
    }

    public static void stop() {
        endTime = System.currentTimeMillis();
        System.out.println("Stopwatch stopped.");
    }

    public static void printElapsedTime() {
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }

    public static void main(String[] args) {
        start(); // Start the stopwatch

        // Perform some task or wait for user input

        stop(); // Stop the stopwatch
        printElapsedTime(); // Print the elapsed time
    }
}

