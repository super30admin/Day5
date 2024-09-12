//Runtime: O(n)
//Space Complexity: O(n)
//Passed on leetcode
//conceptually difficult at first but coding was good once concept was understood
public class Word_Patterns {
    public static boolean wordPattern(String pattern, String s) {

        //make string s to array
        String[] words = new String[s.length()];
        int index = 0;
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                temp = temp + Character.toString(s.charAt(i));
            }
            else{
                words[index] = temp;
                temp = "";
                index++;
            }
        }
        words[index] = temp;

        // for(int i = 0; i < words.length; i++){
        //     System.out.println(words[i]);
        // }


        //check if words and pattern are diff lengths
        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i] != null){
                count++;
            }
        }

        if(count != pattern.length()){
            return false;
        }



        //words to pattern
        HashMap <String, Character> sDict = new HashMap<>();

        //pattern to words
        HashMap <Character, String> tDict = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){

            //word to pattern
            if(sDict.containsKey(words[i])){
                if(!sDict.get(words[i]).equals(pattern.charAt(i))){
                    return false;
                }

            }
            else{
                sDict.put(words[i], pattern.charAt(i));
            }




            //pattern to word
            if(tDict.containsKey(pattern.charAt(i))){
                if(!tDict.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }
            else{
                tDict.put(pattern.charAt(i), words[i]);
            }






        }
        return true;


    }
}