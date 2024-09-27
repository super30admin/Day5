// Time Complexity : O(n)
// Space Complexity : O(1) // for 2 arrays - 256
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class IsomorphicStrings {

    // Creating two arrays to  map characters and their positions in two different things
    // in order to compare them
    public static boolean isIsomorphic(String s, String t) {
        int[] sArray = new int[256];
        int[] tArray = new int[256];

        int n = s.length();

        if(n != t.length()){
            return false;
        }

        for(int i=0; i < n; i++){
            int a = sArray[s.charAt(i)];
            int b = tArray[t.charAt(i)];

            if(a!=b){
                return false;
            }

            sArray[s.charAt(i)] = i + 1;
            tArray[t.charAt(i)] = i + 1;

        }

        return true;
    }

    public static void main(String args[]){
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }
}
