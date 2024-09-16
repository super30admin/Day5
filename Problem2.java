class Solution {
    public boolean isIsomorphic(String s, String t) { // there are total 256 ascii characters
        int[] m = new int[512];
        Arrays.fill(m, 0);
        for(int i = 0; i < s.length(); i++){
            int temp1 = s.charAt(i), temp2 =  t.charAt(i)+256;
            if(m[temp1] != m[temp2]){
                return false;
            }
            m[temp1] = i+1;
            m[temp2] = i+1;
        }
        return true;
    }
}

run time complexity - O(n)
space time complexity - O(1)