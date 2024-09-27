//O(n)  - time| O(1)-  space
class Solution {
    public boolean isIsomorphic(String s, String t) {
        for(int i=0;i<s.length();i++){
           if(s.lastIndexOf(s.charAt(i)) !=t.lastIndexOf(t.charAt(i)))
            {return false;}
        }
        return true;        
	}    
}
