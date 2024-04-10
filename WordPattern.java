class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" "); //Splits the string by " "

        if(pattern.length() != str.length) return false; //Checks if the length of the pattern is not same as length of string
        if (pattern.length() == 0 && str.length == 0) return true; //Checks if the length of pattern or string is 0
        HashMap<Character, String> pMap = new HashMap<>(); //Creates a hashmap to store pattern to s mapping
        HashMap<String, Character> sMap = new HashMap<>(); //Creates another hashmap to store s to pattern mapping

        for (int i = 0;  i < str.length ; i++){
            char pCh = pattern.charAt(i); //Retrieves the char at that index
            String word = str[i]; //Retrieves the word at that index

            if (pMap.containsKey(pCh)){
                if (!pMap.get(pCh).equals(word)) return false; //If the value of the char is not equal to the word then false
            } else{
                pMap.put(pCh, word); //If it is not present in the map then add the key-value pair
            }

            if (sMap.containsKey(word)){
                if (!sMap.get(word).equals(pCh)) return false; //If the value of the word is not equal to the char then false
            } else{
                sMap.put(word, pCh); //If it is not present in the map then add the key-value pair
            }
        }
        return true;
    }
}