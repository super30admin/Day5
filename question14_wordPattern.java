package Hashing1;

import java.util.HashMap;

public class question14_wordPattern {

    /*
    Using 1 HashMap ---->
        Time Complexity : O(n)
        Space Complexity: O(1)
     */
    public boolean wordPattern(String pattern, String s) {

        String[] sArray = s.split(" ");

        if(pattern.length() != sArray.length)  return false;

        HashMap pMap = new HashMap();

        for(Integer i = 0 ; i < sArray.length ; i++) {

            String sStr = sArray[i];
            char pChar = pattern.charAt(i);

            if(!pMap.containsKey(pChar)) {
                pMap.put(pChar, i);
            }
            if(!pMap.containsKey(sStr)) {
                pMap.put(sStr, i);
            }
            if(pMap.get(pChar) != pMap.get(sStr)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
