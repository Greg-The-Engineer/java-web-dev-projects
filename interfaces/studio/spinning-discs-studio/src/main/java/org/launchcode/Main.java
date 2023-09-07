package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        // Create a CD object
        CD myCd = new CD("Music CD", 700, 200);

        // Create a DVD object
        DVD myDvd = new DVD("Movie DVD", 4700, 1200);

        // Test the spinDisc method for CD and DVD
        myCd.spinDisc();
        myDvd.spinDisc();

        // You can perform other operations on myCd and myDvd as needed
    }
}