// Time Complexity :O(n)
// Space Complexity :O(n)//the space for creating the new array
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        HashSet<String> set=new HashSet<String>();
        if(str.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> hash=new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
            if(hash.containsKey(pattern.charAt(i))){
                if(!hash.get(pattern.charAt(i)).equals(str[i])){
                   // System.out.println(pattern.charAt(i)+","+str[i]+","+hash.get(pattern.charAt(i)));
                    return false;
                }
            }else{
                if(set.contains(str[i])){
                    return false;
                }else{
                    hash.put(pattern.charAt(i),str[i]);
                    set.add(str[i]);
                }

            }
            //System.out.println(hash);
        }
        
        return true;
        
    }
}