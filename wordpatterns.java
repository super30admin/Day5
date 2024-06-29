//Time complexity: O(K)
//Space complexity: O(NK). 
//Doubts: Not sure, if my space complexity is correct, I assumed it to be O(NK), as I used an extra space to split and store the second string.  
//In this solution, I'll be splitting the second string and storing it into a string array. I'll check if there exists a key for a character present in the first straing(pattern). If exists, I'll check whether the word is equal to the that is already been assigned to that key. If yes, will return true. Else, will return false. Also I'll be returning false, if the length of the first string is not equal to the number of words in the second string.
// This code was successfully executed and got accepted in leetcode.


class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> h1= new HashMap<>();
        String[] w=str.split("\\s+");
        if(pattern.length()!=w.length){
            return false;
        }
        
        for(int i=0;i<pattern.length();i++){
            if(h1.containsKey(pattern.charAt(i))){
                if(!h1.get(pattern.charAt(i)).equals(w[i])){
                    return false;
                }
            }
            else{
                if(h1.containsValue(w[i])){
                    return false;
                }
                h1.put(pattern.charAt(i),w[i]);
            }
        }
        return true;
    }
    
}