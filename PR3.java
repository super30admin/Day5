// Time Complexity :O(stringlength)
// Space Complexity :O(stringlength)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : Problem faced with comparing strings : had to recall string.equals() method.
// Similar approach as PR2.

class PR3 {
    public boolean wordPattern(String pattern, String str) {
        String[] strs=str.split(" ");
        char[] p=pattern.toCharArray();
        //base condition.
        if(p.length!=strs.length) {
            return false;
        }
     
        Map<Character,String> hmap=new HashMap<Character,String>();
        for(int i=0;i<p.length;i++){
            if(hmap.containsKey(p[i])){
                String s=hmap.get(p[i]);
                if(!s.equals(strs[i])){
                    return false;
                }
            }
            else{
                if(hmap.containsValue(strs[i])) 
                    return false;
                hmap.put(p[i],strs[i]);
                }
        }
        return true;
    }
}