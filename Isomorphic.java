//Runtime: O(n)
//Space Complexity O(1)
//Passed on leetcode
//conceptually difficult at first but coding was good once concept was understood
public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        //has to be isomorphic both ways to pass
        HashMap <Character, Character> sDict = new HashMap<>();
        HashMap <Character, Character> tDict = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(sDict.containsKey(s.charAt(i))){

                //first word to second word
                if(sDict.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }

            }
            else{
                sDict.put(s.charAt(i), t.charAt(i));
            }


            if(tDict.containsKey(t.charAt(i))){
                //second word to first word
                if(tDict.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
            else{
                tDict.put(t.charAt(i), s.charAt(i));
            }

        }
        return true;
    }
}