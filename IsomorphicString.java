//Time - O(n)
//Space - O(1)
import java.util.*;
class Solution {
    public boolean IsomorphicString(String s, String t) {
        int[] mapStoT = new int[256];
        Arrays.fill(mapStoT, -1);

        int[] mapTtoS = new int[256];
        Arrays.fill(mapTtoS, -1);

        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapStoT[c1] == -1 && mapTtoS[c2] == -1){
                mapStoT[c1] = c2;
                mapTtoS[c2] = c1;
            }

            else if(!(mapStoT[c1] == c2 &&  mapTtoS[c2] == c1)){
                return false;
            }
        }
        return true;
    }
}