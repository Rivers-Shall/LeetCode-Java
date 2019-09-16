import java.util.HashMap;

class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> char2OccuranceTimes = new HashMap<>();
        for (int i = 0; i < magazine.length(); ++i) {
            Character current = magazine.charAt(i);
            int occuranceTimes = char2OccuranceTimes.getOrDefault(current, 0) + 1;
            char2OccuranceTimes.put(current, occuranceTimes);
        }

        for (int i = 0; i < ransomNote.length(); ++i) {
            Character current = ransomNote.charAt(i);
            int nRest = char2OccuranceTimes.getOrDefault(current, 0);
            if (nRest == 0) {
                return false;
            } else {
                --nRest;
                char2OccuranceTimes.put(current, nRest);
            }
        }
        return true;
    }
}