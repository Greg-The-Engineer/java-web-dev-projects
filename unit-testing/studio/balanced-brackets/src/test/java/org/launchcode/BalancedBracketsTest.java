package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void initTest() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }


    @Test
    public void stringInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringsAndBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketsAndStringsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void twoSetsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void NestedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void reverseOnlyBracketsReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

}