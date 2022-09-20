package com.nubari.elementarysorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void sort() {
        var a = new Comparable[]{5, 7, 2, 11, 23, -1, 0, 1, 16};
        Sort shellSort = new ShellSort();
        shellSort.sort(a);
        assertEquals(-1, a[0]);
        assertEquals(0, a[1]);
        assertEquals(1, a[2]);
        assertEquals(23, a[a.length - 1]);
        assertEquals(16, a[a.length - 2]);
        System.out.println(Arrays.toString(a));
        var b = new Comparable[]{'S', 'H', 'E', 'L', 'L', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        shellSort.sort(b);
        System.out.println(Arrays.toString(b));

    }
}