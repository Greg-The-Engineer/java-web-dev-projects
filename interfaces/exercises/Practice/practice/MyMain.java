public class MyMain {
    public static void main(String[] args) {
        // Step 7: Create an instance of ByTwos
        ByTwos byTwos = new ByTwos();

// Step 8: Create a for loop that calls the method 5 times
        for (int i = 0; i < 5; i++) {
            int nextValue = byTwos.getNext();
            System.out.println("ByTwos: " + nextValue);
        }

// Create an instance of ByThrees
        ByThrees byThrees = new ByThrees();

        for (int i = 0; i < 5; i++) {
            int nextValue = byThrees.getNext();
            System.out.println("ByThrees: " + nextValue);
        }
    }
}