import java.util.*;;
public class problem1 {

// Time Complexity : O(n)
// Space Complexity : Constant
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

    public List<List<String>> groupAnagrams(String[] strs) {
        
        int prime[] = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,107};
        
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Integer,List<String>> hm2 = new HashMap<>();
        
        for(int i=0;i<26;i++){
            char c = (char)(97+i);
            hm1.put(c,prime[i]);
        }
        
        for(int i=0;i<strs.length;i++){
            int prod = 1;
            String s = strs[i];
            
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                prod = prod*hm1.get(c);
            }
            
            if(!hm2.containsKey(prod)){
                hm2.put(prod, new ArrayList<String>());
            }
            hm2.get(prod).add(s);
            
        }
        
        List<List<String>>ans = new ArrayList<>();
        for(List l: hm2.values()){
            ans.add(new ArrayList<>(l));
        }
        return ans;
        
     
}
