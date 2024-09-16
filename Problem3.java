
Time Complexity: O(n);
Space COmplexity: O(n);

class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> pMap = new HashMap<>();
        Map<String,Character> sMap = new HashMap<>();

        String[] words = s.split(" ");

        for(int i=0;i<words.length;i++){

            char c = pattern.charAt(i);
            String str = words[i];

            if(!pMap.containsKey(c)){

                if(pMap.get(c) != str){

                    return false;
                }

            }else{

                pMap.put(c,str);
            }


            if(sMap.containsKey(c)){

                if(sMap.get(c) != str){

                    return false;
                }

            }else{

                sMap.put(c,str);
            }


        }

        return true;
    }
}



