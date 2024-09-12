// my solution 
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Check string lenght equal or not
        if(s.length()!= t.length()) return false;
        
        //creating Hashmap to store mapping
        HashMap<Character, Character> mapp = new HashMap<>();
        
        for(int i=0; i<s.length() ; i++){ // time complexity of O(n)
            //creating and checking the mapping of each caharter
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            //checking whether the key is in map or not
            if(mapp.containsKey(c1)){
                if(mapp.get(c1)!= c2){
                    return false ; 
                }
            }else{
                // if map does not contains key but value is present the mapping incorrect
                  if(mapp.containsValue(c2)) return false;
                //key val no present then add a mapping for it
                mapp.put(c1,c2);
            }
        }
        return true;
    }
}