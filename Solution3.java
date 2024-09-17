//Time Complexity :O(nklogk) +O(k)
// Space Complexity :O(nk)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class Solution3 {
    public boolean wordPattern(String pattern, String s) {
        char [ ] patternArray = pattern.toCharArray();
        String [] stringArray= s.split(" ");
        HashMap<Character,String> hp= new HashMap<>();
        HashSet<String> set=new HashSet<>();
        if(patternArray.length !=stringArray.length)
            return false;
        for(int i=0;i<patternArray.length;i++){
            if(!hp.containsKey(patternArray[i])){
                hp.put(patternArray[i],stringArray[i]);
                
                if(set.contains(stringArray[i]))
                    return false;
                else
                    set.add(stringArray[i]);
            }
            else
            {
                if(!hp.get(patternArray[i]).equals(stringArray[i]))
                    return false;
            }
        }
      return true;  
    }
}