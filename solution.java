//finding the peak element.
//TC:-O(logn)
//space:-O(1)

public class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}

//Isomorphic string
//TC:-O(n) where n is the length of the string
//SC:- O(256) where we are using a hashmap of length which wil be maximun of 256 characters.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null||s.length()==0){
            return false;
        }
        HashMap<Character,Character> sMap=new HashMap<Character,Character>();
        HashMap<Character,Character> tMap=new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),t.charAt(i));
            }
            else{
                if(sMap.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),s.charAt(i));
            }
            else{
                if(tMap.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }
            
        }
        return true;
        
        
    }
}

// Word Pattern
//TC O(n)
// SC O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        char char_arr[]=pattern.toCharArray();
        String str_arr[]=s.split(" ");
        if(char_arr.length!=str_arr.length){
            return false;
        }
        HashMap<Character,String> pmap=new HashMap<>();
        HashMap<String,Character> smap=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=char_arr[i];
            String str=str_arr[i];
            if(pmap.containsKey(c)){
                if(!str.equals(pmap.get(c))){
                    return false;
                }
            }else{
                pmap.put(c,str);
            }
            if(smap.containsKey(str)){
                if(c!=smap.get(str)){
                    return false;
                }
            }else{
                smap.put(str,c);
            }
            
        }
        return true;
        
    }
}


//Group Anagrams
//TC O(nk)
//SC O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<List<String>>();
        HashMap<String,List<String>> hash=new HashMap<>();
        int[] count=new int[26];
        Arrays.fill(count,0);
        for(int i=0;i<strs.length;i++){
            
            
            String current=strs[i];
            for(int j=0;j<current.length();j++){
                count[(int)current.charAt(j)-(int)'a']++;
                
            }
            String cnt_string=Arrays.toString(count);
            Arrays.fill(count,0);
            if(hash.containsKey(cnt_string)){
                hash.get(cnt_string).add(current);
            }else{
                hash.put(cnt_string,new ArrayList<String>());
                hash.get(cnt_string).add(current);
            }
            
             
        }
        hash.forEach((k,v) ->
            result.add(v));
        
        return result;
        
    }
}