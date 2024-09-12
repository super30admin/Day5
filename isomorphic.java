//Time complexity:O(n) n->length of the strings
//Space Complexity:O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap();
        HashSet<Character> set=new HashSet();
        int i=0;
        while(i!=s.length()){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(!map.containsKey(a)){
                if(set.contains(b)) return false;
                map.put(a,b);
                set.add(b);
                
            }
            else{
                if(map.get(a)!=b){
                    return false;
                 }
            }
            i++;
        }
        return true;
    }
}