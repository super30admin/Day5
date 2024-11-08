import java.util.HashMap;
import java.util.HashSet;

/*
Time Complexity: O(n)
Splitting the string: O(n), where n is the length of s.
Iterating through the pattern and words: O(m), where m is the length of pattern (which is equal to the number of words after splitting s).
Map operations: For each iteration, both patternMap and sSet operations are O(1), so the total complexity for them is O(m).
Thus, the overall time complexity is:

O(n + m), where:

n is the length of string s
m is the length of the pattern (or number of words in s after splitting)
Since the number of words is generally proportional to the length of s, the time complexity simplifies to:

O(n) (where n is the length of string s).

Space Complexity:

For user-defined operations and auxiliary space complexity: O(1) (because the map and set require constant space for a fixed number of
unique characters or words).
For overall space complexity (which includes input size): O(n), due to the space required for splitting the input string s into words.
 */

class WordPatternUsingHashSet {
    public boolean wordPattern(String pattern, String s) {

        if(pattern == null && s == null) return true;
        if(pattern == null || s == null) return false;


        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> sSet = new HashSet<>();

        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        for(int i=0; i<words.length; i++)
        {
            char patternChar = pattern.charAt(i);
            String wordStr = words[i];

            if(patternMap.containsKey(patternChar)) {

                /*
                 Here != won't work in below sentence because:

                Why != Works Here:
                For primitive types like char, int, float, etc., the comparison using != checks the values directly so it worked in
                Isomorphic problem.
                For objects like String, HashMap, or ArrayList, != checks reference equality, i.e., whether the two objects are stored
                at the same memory location, which is not what we want when comparing their content.

                Conclusion:
                For primitive types like char, the != operator works correctly to compare values.
                For objects (such as String or custom classes), we must use equals() to compare their contents.
                In the wordPattern problem, patternMap.get(patternChar) returns a String, so we need to use .equals() to compare the
                strings' contents.
                 */

                if (!patternMap.get(patternChar).equals(wordStr))
                {
                    return false;
                }
            }
            else {

                if(sSet.contains(wordStr)) return false;

                sSet.add(wordStr);
                patternMap.put(patternChar, wordStr);
            }
        }

        return true;
    }
}