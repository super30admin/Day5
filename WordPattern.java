import java.util.HashMap;

class WordPattern {

    //Time Complexity: 0(n)
    //Space complexity: 0(n)
    //Did it successfully run on leetcode: Yes
    //Did you face any problems: No

    //In short explain your approach: I am creating 2 hashmap. One for storing the character as key and the word as value
    //and other to store the opposite. In every iteration, it checks if the 1st or 2nd hashmap have encountered the pattern
    //or not. If yes, it then checks is it equal to the previous pattern? If yes then it moves on, if not, it returns false
    //as there is already something mapped to the character. If the hashmap doesn't find the value, it goes ahead and adds
    //them to it.

    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if(pattern.length() != strArray.length){
            return false;
        }
        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String str = strArray[i];
            if(!pmap.containsKey(c)){
                pmap.put(c, str);
            }
            else{
                if(!pmap.get(c).equals(str)){
                    return false;
                }
            }
            if(!smap.containsKey(str)){
                smap.put(str, c);
            }
            else{
                if(!smap.get(str).equals(c)){
                    return false;
                }
            }
        }
        return true;
    }
}