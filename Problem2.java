import java.util.Arrays;

class Problem2 {
    public boolean isIsomorphic(String s, String t) {

        int m1[] = new int[256];
        int m2[] = new int[256];

        Arrays.fill(m1,0);
        Arrays.fill(m2,0);

        for(int i = 0; i < s.length(); i++ )
        {
            if(m1[s.charAt(i)] != m2[t.charAt(i)])
            {
                return false;
            }

            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }

        return true;
    }
}


/*
Time complexity : O(N)

Space complexity : O(1) constant as only 256 ascii characters
 */
