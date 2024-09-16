// Time Complexity : O(N) where N is maximum of word string of the String. O(1) anyway for HashMaps
// Space Complexity : O(N) where N is the length of word string since we are storing in a array, hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.HashMap;

public class WordProblem {
        public boolean wordPattern(String s, String t) {
            //base case
            if(s.length() ==0 || t.length()==0 || s==null || t==null){
                return false;
            }

            //logic
            String[] splitT = t.split("\\s+"); //Splitting the String t into array split by spaces
            if(s.length() != splitT.length){
                return false;
            }

            HashMap<Character, String> sMap = new HashMap<>(); //Comparing s-> t
            HashMap<String, Character> tMap = new HashMap<>(); //Comparing t-> s
            for(int i=0; i<s.length(); i++){
                char sChar = s.charAt(i);
                String tString = splitT[i];

                if(sMap.containsKey(sChar)){ //Check in the sMap first that sChar is tagged to tChar
                    if(!sMap.get(sChar).equals(tString)){
                        return false;
                    }
                }
                if(tMap.containsKey(tString)){ //Check in the tMap first that tChar is tagged to sChar
                    if(tMap.get(tString) != sChar){
                        return false;
                    }
                }
                else{ //If not in the maps, add it here in both maps. This is to check unique mapping.
                    sMap.put(sChar, tString);
                    tMap.put(tString, sChar);
                }
            }
            return true; //If all above passes through, its a pass !
        }
    }

