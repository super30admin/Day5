// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
//I will take two hashmaps and check the key value pair of first hashmap with key value pairs of another hashmap, 
//if first hashmap is empty, I will add key and value to it and if the key and value pairs of hashmaps 
//are not equal then I wil retun false 

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> smap = new HashMap<Character,String>();
        HashMap<String,Character> tmap = new HashMap<String,Character>();
        
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;
        
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String curr = arr[i];
            
            if(!smap.containsKey(ch)){
                smap.put(ch,curr);
            }
            else {
                if(!smap.get(ch).equals(curr)) return false;
            }
                
            if(!tmap.containsKey(curr)){
                tmap.put(curr,ch);
            }
            else{
                if(tmap.get(curr)!=ch) return false;
            } 
            
        }
        return true;
    }
}