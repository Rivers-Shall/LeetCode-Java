import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> setOfChar2GroupIndex = new HashMap<>();
        List<List<String>> anagramGroups = new ArrayList<>();
        for (String str : strs) {
            char[] strCharArray = str.toCharArray();
            Arrays.sort(strCharArray);
            String sortedStr = new String(strCharArray);
            Integer groupIndex = null;
            if ((groupIndex = setOfChar2GroupIndex.get(sortedStr)) == null) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                anagramGroups.add(newGroup);
                setOfChar2GroupIndex.put(sortedStr, anagramGroups.size() - 1);
            } else {
                anagramGroups.get(groupIndex).add(str);
            }
        }
        return anagramGroups;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.groupAnagrams(new String[] {"eat", "tea", "tan", "nat", "ate", "bob", "boo"}));
    }
}