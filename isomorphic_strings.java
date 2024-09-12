class Solution{
    public boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false; //if the length of the strings s and t are not equal, we return false. this is the base case.
        HashMap<Character, Character> sMap = new HashMap<>(); // we create a hashMap for s as sMap and pass char as the inputs. we maintain a character to character mapping
        HashMap<Character, Character> tMap = new HashMap<>(); // we create a hashMap for t as tMap and pass char as the inputs.
        for(int i = 0; i < s.length(), i++){ // we go through the string
            char sChar = s.charAt(i); // we take a char from string s present at location i and store it in sChar.
            char tChar = t.charAt(i); // we take a char from string t present at location i and store it in tChar.
            if(!sMap.containsKey(sChar)){ // if the character than you get in sChar is not already present in sMap
                sMap.put(sChar, tChar) // we put the value of sChar, tChar in the sMap. We are doing the mapping of the elements present in both the strings here.
            }
            else { // if sMap already contains the character that you enocunter in the sChar
                if(sMap.get(sChar) != tChar) { // we compare the character sChar we already have in sMap with tChar and if both them are not equal
                    return false; // we return false
                }
            }
            if(!tMap.containsKey(tChar)){ // if the character than you get in tChar is not already present in tMap
                tMap.put(tChar, sChar) // we put the value of tChar, sChar in the tMap. We are doing the mapping of the elements present in both the strings here.
            }
            else { // if tMap already contains the character that you enocunter in the tChar
                if(tMap.get(tChar) != sChar) { // we compare the character tChar we already have in tMap with sChar and if both them are not equal
                    return false; // we return false
                }
            }
        }
        retun true;
    }
}
//TC - O(n) and SC - O(n)