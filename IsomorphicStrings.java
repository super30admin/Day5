package S30.Hashing_1;

// Time Complexity : O(n), n - length of s or t ( both should be same)
// Space Complexity : O(1) - Sizes of hashmaps are fixed, don't vary with string length
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        //edge case - return early if lengths not equal
        if(s.length() != t.length()) return false;
        int len = s.length();

        Character[] sMap = new Character[100];
        Character[] tMap = new Character[100];

        for(int i = 0; i < len; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            //Try to map each character in s to its corresponding character in t. If doesn't match, return false
            if(sMap[sChar - ' '] != null){
                if(sMap[sChar - ' '] != tChar){
                    return false;
                }
            }else{
                sMap[sChar - ' '] = tChar;
            }

            //Try to reverse map each character in t to its corresponding character in s. If doesn't match, return false
            // use case: s = "ate", t = "aaa", multiple characters in s mapping to same in t - won't be isomorphic
            if(tMap[tChar - ' '] != null){
                if(tMap[tChar - ' '] != sChar){
                    return false;
                }
            }else{
                tMap[tChar - ' '] = sChar;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        IsomorphicStrings testClass = new IsomorphicStrings();
        System.out.println(testClass.isIsomorphic("egg", "add"));
        System.out.println(testClass.isIsomorphic("paper", "title"));
        System.out.println(testClass.isIsomorphic("foo", "bar"));

    }
}
