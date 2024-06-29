//Here I have solved the same problem using two different methods. The first method was done by me before the class where I used a single loop and checked the conditions to see if the characters are mapped the same. If not I'll be returning false. Else, I'll return true. Both these approaches have the same time and space complexity of O(K) on an average where K will be length of the string, with the worst case being O(N). Both these codes were successfully compiled and accepted in leetcode.


class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Character> h2=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for (int i=0;i<s.length();i++){
            if(h1.containsKey(s.charAt(i)) && h1.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            if(h2.containsKey(t.charAt(i)) && h2.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
            h1.put(s.charAt(i),t.charAt(i));
            h2.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Character> h2=new HashMap<>();
        
        for (int i=0;i<s.length();i++){
            if(h1.get(s.charAt(i))!=null){
                if(h1.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                h1.put(s.charAt(i),t.charAt(i));
            }
        }
        for (int i=0;i<t.length();i++){
            if(h2.get(t.charAt(i))!=null){
                if(h2.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }
            else{
                h2.put(t.charAt(i),s.charAt(i));
            }
        }
            
        return true;
    }
}