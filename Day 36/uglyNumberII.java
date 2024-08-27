// 264. Ugly Number II
import java.util.*;

public class uglyNumberII {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> seen = new HashSet<>();

        pq.offer(1L);
        seen.add(1L);

        int count = 0;
        long currentUgly = 1;

        while (count < n) {
            currentUgly = pq.poll();
            count++;

            if (count == n) {
                return (int) currentUgly;
            }

            long x1 = currentUgly * 2;
            long x2 = currentUgly * 3;
            long x3 = currentUgly * 5;

            if (!seen.contains(x1)) {
                pq.offer(x1);
                seen.add(x1);
            }
            if (!seen.contains(x2)) {
                pq.offer(x2);
                seen.add(x2);
            }
            if (!seen.contains(x3)) {
                pq.offer(x3);
                seen.add(x3);
            }
        }

        return 0;
    }
}
