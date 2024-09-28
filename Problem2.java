// Time Complexity - O(n) where n is the number of characters in the string
// Space Complexity - O(1) Since the HashMap will have 26 characters in worst case for lower case characters and 52 in case of both lower case and upper case
// This solution worked on LeetCode
// In the below solution to check isomorphic for string s and t, we will create 2 hashmaps for s and t. As we process each character of the string. We will put character from s as key and character from t as value in sHash. Similarly, we can do it for tHash where character from t will be key and character from s will be value. As we process, if the sHash already contains the character we will compare the character in hashMap value and the character in t

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())    return false;
        HashMap<Character,Character> sHash = new HashMap<>();
        HashMap<Character,Character> tHash = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(!sHash.containsKey(a)){
                sHash.put(a,b);
            }
            else if(!sHash.get(a).equals(b)){
                return false;
                
            }
            if(!tHash.containsKey(b)){
                tHash.put(b,a);
            }
            else if(!tHash.get(b).equals(a)){
                return false;
                
            }
        }
        return true;
    }
}
