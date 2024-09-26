// Time Complexity : O(N)
// Space Complexity : O(1), size is  fixed, do not change with input
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.Arrays;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        int[] mapStoT = new int[256];
        Arrays.fill(mapStoT, -1);

        int[] mapTtoS = new int[256];
        Arrays.fill(mapTtoS, -1);

        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            //No mapping in either of the maps
            if(mapStoT[c1] == -1 && mapTtoS[c2] == -1) {
                mapStoT[c1] = c2;
                mapTtoS[c2] = c1;
            }
            //Mapping do not match
            else if( !(mapStoT[c1] == c2 && mapTtoS[c2] == c1))
                return false;
        }
        return true;
    }
}
