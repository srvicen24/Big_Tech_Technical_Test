package demo;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/*
This is a demo task.

Write a function:

class demo.Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Copyright 2009–2024 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure
prohibited.
 */

class Solution {
    public int solution(int[] A) {
        int n = A.length;
        boolean[] found = new boolean[n];
        for (int i : A) {
            // if i is in the range of 1 to n, mark it as found
            if (i > 0 && i <= n) {
                found[i - 1] = true;
            }
        }

        // find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (!found[i]) {
                return i + 1;
            }
        }

        // if all positive integers are found, return n + 1
        return n + 1;
    }

    // Order of Complexity: O(N)
    // Order of Space: O(N)
}
