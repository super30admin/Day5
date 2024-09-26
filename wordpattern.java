//Time Complexity: O(n).
//Space Complexity: O(2n).
//Does this code run on Leetcode: Yes.
//Any problems faced during execution: No. 

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> letterPattern = new HashMap<>();
        HashMap<String, Character> StringPattern = new HashMap<>();

        String[] conString = s.split(" ");

        System.out.println(conString.length);
        if(pattern.length() != conString.length){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            if(letterPattern.containsKey(pattern.charAt(i))){
                if(! letterPattern.get(pattern.charAt(i)).equals(conString[i]))
                    return false;
            }
            else
                letterPattern.put(pattern.charAt(i), conString[i]);

            if(StringPattern.containsKey(conString[i])){
                if(! StringPattern.get(conString[i]).equals(pattern.charAt(i)))
                    return false;
            }
            else
                StringPattern.put(conString[i], pattern.charAt(i));
        }
        return true;
    }
}