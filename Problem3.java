class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap ans = new HashMap();
        String[] ss = s.split(" ");
        
        if(pattern.length() != ss.length) {return false;}
        
        for(Integer i=0; i< ss.length; i++) {
            char a = pattern.charAt(i);
            String b = ss[i];

            ans.putIfAbsent(a, i);
            ans.putIfAbsent(b, i);
            
            if(ans.get(a) != ans.get(b)) {return false;}
        }
        
        return true;
    }
}