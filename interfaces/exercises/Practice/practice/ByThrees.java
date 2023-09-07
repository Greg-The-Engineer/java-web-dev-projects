// Step 3: Then create a class called ByThrees
class ByThrees implements Series {
    private int val;

    // Step 4: Implement the interface in both classes, create int val, create constructor that initializes value to 0
    public ByThrees() {
        val = 0;
    }

    // Step 6: In ByThrees, create a method that increments int by three and returns val
    public int getNext() {
        val += 3;
        return val;
    }
}