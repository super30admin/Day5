// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*Explaination:
1. i am converting the string of words to list of strings spliting by space.
2. if the length of words array and pattern characters does not match, test will fail
for sure, so return false. 
3. now i am using two hashmaps to store corresponding word for pattern and visa versa
4. if the keys exist but does not match the value the tets fails and i return false.
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] arr= s.split(" ");
        if(pattern.length() != arr.length) return false;
        HashMap<Character, String> cToS = new HashMap<>();
        HashMap<String, Character> sToC = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(cToS.get(pattern.charAt(i)) != null){
                if(!cToS.get(pattern.charAt(i)).equals(arr[i])) return false;
            } else cToS.put(pattern.charAt(i), arr[i]);
            if(sToC.get(arr[i]) != null){
                if(!sToC.get(arr[i]).equals(pattern.charAt(i))) return false;
            } else sToC.put(arr[i], pattern.charAt(i));
        }
        return true;
    }
}