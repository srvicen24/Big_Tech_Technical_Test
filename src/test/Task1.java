package test;

class Solution {
    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        return A[0] == 1 || A[n - 1] == K;
    }
}
