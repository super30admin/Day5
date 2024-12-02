//tc-O(n) we can use two hashmap or onw hashmap and 1 hashset for optimized
//sc-O(1) only 26 character will be there so constant


//with one hashmap only 
// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if(s == null || t == null || s.length() != t.length())
//             return false;
//         HashMap <Character, Character> map = new HashMap <Character, Character>();
//         for(int i = 0; i < s.length(); i++){
//             char ss = s.charAt(i);
//             char tt = t.charAt(i);
//             if(map.containsKey(ss)){
//                 if(map.get(ss) != tt)
//                     return false;
//             }
//             else if(map.containsValue(tt))
//                 return false;
//             map.put(ss,tt);
//         }
//         return true;
//     }
// }


//with 2 hashmap
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false;
        HashMap <Character, Character> sMap = new HashMap<>();
        HashMap <Character, Character> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(sMap.containsKey(ss)){
                if(sMap.get(ss) != tt)
                    return false;
            }
            sMap.put(ss,tt);
           if(tMap.containsKey(tt)){
              if(tMap.get(tt) != ss)
                    return false;
           }
            tMap.put(tt, ss);
        }
        return true;
    }
}