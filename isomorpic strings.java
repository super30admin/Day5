//Time complexity:- O(n).
//Space complexity:-o(n0
//did it run on leetcode:- Yes.
//What problems did you face?;- got error in strings equality.
// your code with explanation:- in a hashmap taking charecter as key and other charecter as value and comparing like that by traversing wholly it 
//returns false if there is no matching charecter as key and have value or have different value with associated key.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if(!map1.containsKey(s1)){
                if(map1.containsValue(t1)){
                    return false;
                }
            }
               
            else if(map1.get(s1)!=t1){
                 return false;
             }
            map1.put(s1,t1);
        }  
        
   
    return true; }
}