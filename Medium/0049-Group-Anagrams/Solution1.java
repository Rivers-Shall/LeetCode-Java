import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, Integer> setOfChar2GroupIndex = new HashMap<>();
        List<List<String>> anagramGroups = new ArrayList<>();
        for (String str : strs) {
            Map<Character, Integer> char2OccurTime = new HashMap<>();
            for (char c : str.toCharArray()) {
                int occurTime = char2OccurTime.getOrDefault(c, 0) + 1;
                char2OccurTime.put(c, occurTime);
            }
            Integer groupIndex = null;
            if ((groupIndex = setOfChar2GroupIndex.get(char2OccurTime)) == null) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                anagramGroups.add(newGroup);
                setOfChar2GroupIndex.put(char2OccurTime, anagramGroups.size() - 1);
            } else {
                anagramGroups.get(groupIndex).add(str);
            }
        }
        return anagramGroups;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.groupAnagrams(new String[] {"eat", "tea", "tan", "nat", "ate", "bob", "boo"}));
    }
}