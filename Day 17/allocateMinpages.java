// Allocate Minimum Pages

public class allocateMinpages {
    public static int findPages(int N, int [] A, int M) {
        int sum = 0, max = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
            max = Math.max(max, A[i]);
        }
        if (N < M) // If the number of books is less than the number of students, it's not possible to allocate the books
            return -1;
        int low = max, high = sum, res = -1; // Initialize res to -1
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isFeasible(A, N, M, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static boolean isFeasible(int[] A, int N, int M, int ans) {
        int req = 1, sum = 0;
        for (int i = 0; i < N; i++) {
            if (sum + A[i] > ans) {
                req++;
                sum = A[i];
            } else {
                sum += A[i];
            }
        }
        return (req <= M);
    }
}
