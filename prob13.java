prob-13 Isomorphic string

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s== null || t==null  )
            return false;
        
        int[]d1 = new int[256];
        int[]d2 = new int[256];
        int n= s.length();
        
        for( int i=0 ; i <n; i++){
            char a1=s.charAt(i);
            char a2=s.charAt(i);
            if(d1[a1]!=d2[a2])
                return false;
            d1[a1] = i+1;
            d2[a2]= i+1;
        }
        return true;
        
    }
}

Time complexity:0(mn)
Space complexity:0(1)