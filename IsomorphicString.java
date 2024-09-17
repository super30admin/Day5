// Time Complexity: 0(N)
// Space Complexity: 0(1)
// Did the program run on leetcode: Yes
import java.util.Arrays;
public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {
        // integer array to map characters from String s to String t
        int[] s_t = new int[256];
        // integer array to map characters from String t to String s
        int[] t_s = new int[256];

        // FIll the array values with -1;
        Arrays.fill(s_t, -1);
        Arrays.fill(t_s, -1);

        if(s.length() != t.length()) return false;

        for(int i=0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            // If No mapping exisits
            if(s_t[c1] == -1 && t_s[c2] == -1){
                s_t[c1] = c2;
                t_s[c2] = c1;
            }
            //if mapping doesnt exist in one of the array or the values dont match
            else if(!(s_t[c1] == c2 && t_s[c2] == c1)){
                return false;
            }
        }

        return true;

    }
}
