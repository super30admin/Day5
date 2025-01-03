/**
 * Time complexity: O(N)
 * Space complexity: O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : no
 */
public class IsomorphicStrings {
    /**
     * Utilizing the property of storing char from s string into t array and
     * vice versa by ensuring that character is not already stored by
     * @param s string 1
     * @param t string 2
     * @return true if its isomorphic, false otherwise
     */
    public boolean isIsomorphic(String s, String t) {
        int[] sTot = new int[256];
        int[] tTos = new int[256];

        for(int i=0; i< s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sTot[tChar] == 0 && tTos[sChar] == 0) {
                sTot[tChar] = sChar;
                tTos[sChar] = tChar;
            }

            if(!(sTot[tChar] == sChar && tTos[sChar] == tChar)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "add";
        String t = "thh";
        IsomorphicStrings obj = new IsomorphicStrings();
        boolean result = obj.isIsomorphic(s, t);
        System.out.println("Result: " + result);
    }
}
