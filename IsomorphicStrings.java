// Time Complexity: O(n): n is the length of string s and t.
// Space Complexity: O(n): n is the length of string s or t.

class IsomorphicStrings{
public boolean isIsomorphic(String s,String t){

        if(s.length()!=t.length())return false;

        Map<Character, Character> map=new HashMap<>();

            for(int i=0;i<s.length();i++){

            char key=s.charAt(i);
            char value=t.charAt(i);

            if(!map.containsKey(key)){
            // there exists another key with the same value
                if(map.containsValue(value)){
                    return false;
                }
                map.put(key,value);
            }
            else{
            // if key is already present, if the value is different, return false
                if(map.get(key)!=value){
                return false;
                }
            }
        }
        return true;
    }
}
