import java.util.HashMap;

// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

public class IsmorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character>smap=new HashMap<>();
        HashMap<Character,Character>tmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            if(!smap.containsKey(schar)){
                smap.put(schar,tchar);
            }
            else{
                if(smap.get(schar)!=tchar){
                    return false;
                }
            }
            if(!tmap.containsKey(tchar)){
                tmap.put(tchar,schar);
            }
            else{
                if(tmap.get(tchar)!=schar){
                    return false;
                }
            }
            
        }
        return (smap.size()==tmap.size());
    }
    public static void main(String args[]){
        IsmorphicStrings obj=new IsmorphicStrings();
        String s="egg";
        String t="add";
        System.out.println(obj.isIsomorphic(s, t));
    }
}