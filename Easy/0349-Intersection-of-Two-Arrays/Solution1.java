import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        // https://examples.javacodegeeks.com/core-java/java-8-convert-a-primitive-array-to-list-example/
        Set<Integer> nums1Set = new HashSet<Integer>(IntStream.of(nums1).boxed().collect(Collectors.toList()));
        Set<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            if (nums1Set.contains(num)) {
                intersection.add(num);
            }
        }
        // https://stackoverflow.com/questions/2451184/how-can-i-convert-a-java-hashsetinteger-to-a-primitive-int-array
        return intersection.stream().mapToInt(Number::intValue).toArray();
    }
}