class ByTwos implements Series {
    private int val;

    // Step 4: Implement the interface in both classes, create int val, create constructor that initializes value to 0
    public ByTwos() {
        val = 0;
    }

    // Step 5: In ByTwos, create a method that increments int by two and returns val
    public int getNext() {
        val += 2;
        return val;
    }
}