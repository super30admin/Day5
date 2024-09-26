// Time complexity = O(n)
// Space Complexity = O(52)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        int[]  res1 = new int[26];
        int[]  res2 = new int[26];
        
        pattern=pattern.toLowerCase();
        s=s.toLowerCase();
        for(int i=0;i<pattern.length();i++){
            int a=pattern.charAt(i);
            res1[a%97]+=1;
        }
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= ' '){
                  int a=s.charAt(i);
            res2[a%97]+=1;
            }
          
        }
        
        for(int i=0;i<26;i++){
            if(res1[i]!=res2[i]) return false;
        }
        return true;
    }
}
