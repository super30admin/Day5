// solution2 tashmap and hashset 
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

// Your code here along with comments explaining your approach I used two hashmaps: `<Character, String>` and `<String, Character>`, allowing O(1) lookups. The time complexity is O(n) since we traverse both strings once. The space complexity is O(n) because, while the pattern has at most 26 characters (O(1)), the second hashmap for `s` contains up to `n` words, making the overall complexity O(n).  

// **Solution 1:** Uses two hashmaps with the same approach as described above.
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> sMap = new HashMap<Character,String>();
        HashMap<String,Character> tMap = new HashMap<String, Character>();
        int sl = pattern.length();
        String[] tArray =s.split(" ");
        if(sl != tArray.length){
            return false;
        }
        for(int i=0;i<sl;i++){
            char sChar=pattern.charAt(i);
            String tWord = tArray[i];
            if(!sMap.containsKey(sChar)){
                 sMap.put(sChar,tWord);
            }else if(!sMap.get(sChar).equals(tWord) ){
               return false;

            }
             if(!tMap.containsKey(tWord)){
                 tMap.put(tWord,sChar);
            }else if(tMap.get(tWord) != sChar){
                 System.out.println("=t"+ i);
                return false;

            }
        } 
        return true;
    }
}