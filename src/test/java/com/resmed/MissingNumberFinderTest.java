package com.resmed;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MissingNumberFinderTest {

    @Test
    public void testFindMissingNumber() {
        MissingNumberFinder missingNumberFinder = new MissingNumberFinder();
        assertEquals(missingNumberFinder.findMissingNumber(new int[]{1,2,4}), 3);
        assertEquals(missingNumberFinder.findMissingNumber(new int[]{1,5,6,7,2,3,4,9,10}), 8);
    }
}