import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    private class Greater implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            int compare = a.compareTo(b);
            if (compare > 0) {
                return -1;
            } else if (compare < 0) {
                return 1;
            }
            return 0;
        }
    }
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Greater());

        for (int stone : stones) {
            queue.add(stone);
        }
        while (queue.size() > 1) {
            int y = queue.remove();
            int x = queue.remove();
            if (y > x) {
                queue.add(y - x);
            }
        }
        return queue.isEmpty() ? 0 : queue.remove();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}));
    }
}