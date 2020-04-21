import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution1 {
    public List<Integer> grayCode(int n) {
        List<Integer> grayCode = new ArrayList<>();
        grayCode.add(0);
        for (int i = 0; i < n; ++i) {
            List<Integer> newList = new ArrayList<>();
            for (int x : grayCode) {
                newList.add(x * 2);
            }
            Collections.reverse(grayCode);
            for (int x : grayCode) {
                newList.add(x * 2 + 1);
            }
            grayCode = newList;
        }
        return grayCode;
    }
    
    public static void main(String[] args) {
        Solution1 s = new Solution1();

        System.out.println(s.grayCode(0));
        System.out.println(s.grayCode(1));
        System.out.println(s.grayCode(2));
    }
}