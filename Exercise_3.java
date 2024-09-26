//Time complexity  - O(N)
//Space complexity - O(N)



class Solution {
    public boolean wordPattern(String pattern, String s) {


        /** Check the mapping of both character and string by creating 2 maps */
        Map<Character, String> mapCharacter = new HashMap<>();
        Map<String, Character> mapWord = new HashMap<>();

        String[] words = s.split(" ");

        /** if the length of the word and pattern is not same return */
        if(words.length != pattern.length()) return false;

        for(int i = 0; i< words.length; i++) {

            char c1 = pattern.charAt(i);

            String w = words[i];


            /** check if the character is inside the map*/
            if(!mapCharacter.containsKey(c1)){

                /** check if the word is there inside another map */
                if(mapWord.containsKey(w)) {

                    return false;

                }

                /** if character and words are not mapped inside hashmap use put operation to store the mapping for both maps */
                mapCharacter.put(c1,w);
                mapWord.put(w,c1);

            }
            else {
                /** check the mapping of word with char if present or return false */
                String wordMapped = mapCharacter.get(c1);
                if(!wordMapped.equals(w)) {

                    return false;
                }

            }


        }


        return true;




    }
}