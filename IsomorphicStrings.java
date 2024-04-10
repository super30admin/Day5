class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap <Character, Character> map = new HashMap<>(); //Creates a hasmap to keep a track of the mapping
        HashSet <Character> set = new HashSet<>(); //Creates a hashset to store just the values

        for (int i = 0; i < s.length(); i++){
            char sCh = s.charAt(i); //Stores the character in sCh
            char tCh = t.charAt(i); //Stores the character in tCh

            if(map.containsKey(sCh)){ //If the element is present in the hashmap
                if(map.get(sCh) != tCh){ //Checks if the value of that key is not equal to tCh to see if it has been mapped correctly
                    return false;
                }
            } else{
                if (set.contains(tCh)) return false; //If the set contains the value then that means it's already stored the value in the hashmap
                map.put(sCh, tCh); //If not it adds the key-value pair to the map
                set.add(tCh); // If not it add the value to the set
            }

        }
        return true;
    }
}