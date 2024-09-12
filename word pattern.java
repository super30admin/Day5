//Time complexity:- O(n).
//Space complexity:-o(n0
//did it run on leetcode:- Yes.
//What problems did you face?;- got error in strings equality.
// your code with explanation:- in a hashmap taking charecter as key and string as value and comparing like that by traversing wholly it 
//returns false if there is no matching charecter as key and have value or have different value with associated key.


class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> check=new HashMap<>();
        String[] splits=s.split(" ");
        if(pattern.length()!=splits.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String s1=splits[i];
            if(!check.containsKey(ch)){
                if(check.containsValue(s1))
                    return false; 
            } 
            else {
                if(!check.get(ch).equals(s1)){
                return false;
            }
            }
             check.put(ch,s1);
        }
        
    return true;}
}