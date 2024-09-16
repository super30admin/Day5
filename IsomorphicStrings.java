// You can also use a hashmap, but since in the question that have mentioned all the characters will be within the ascii limit
// we can use an array of length 256 and solve this problem 

// Time Complexity : O(n)
// Space Complexity : O(2 * 256) which can be considered as O(1)

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] m1 = new int[256], m2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)])
                return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
