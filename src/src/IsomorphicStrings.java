import java.util.HashMap;

//TC : O(n) where n is the length of the string given
//SC : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


//The approach taken is to create a mapping between characters of both strings.
//We iterate over the array and if at any point we find that the character in String t is already mapped to a different value of String s, then return false
//also check whether the character is String s has been mapped already to another character in String t
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0; i<s.length();i++)
        {

            //in cases where character in String tt is already mapped, we check whether the mapping is same
            if(map.containsKey(t.charAt(i)))
            {
                if(map.get(t.charAt(i)) != s.charAt(i))
                    return false;
            }

            //if not mapped already then we check whether the character is String s has been mapped already to another character in String t
            //if not mapped then simply add the mapping
            else
            {
                if(map.containsValue(s.charAt(i)))
                    return false;
                map.put(t.charAt(i), s.charAt(i));
            }

        }

        return true;

    }


    //TC : O(n) where n is the length of the string given
//SC : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


    //In this approach, we use two int arrays and use the fact that for any two characters in String s and String at the same position,
    //their mapping in the arrays should also be the same
    public boolean isIsomorphic_approachTwo(String s, String t) {
        int n = s.length();
        int m1[] = new int[256];
        int m2[] = new int[256];


        for (int i = 0; i < n; ++i) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
