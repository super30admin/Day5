// Time Complexity : O (nk)
// Space Complexity : O (nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Getting Space Complexity

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem1 {

        // Use Primes to have product of strings. Unique product will arrive
        int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        public List<List<String>> groupAnagrams(String[] strs) {
        
            
        if(strs==null || strs==null) return new ArrayList<>();
        HashMap<Double,List<String>>map=new HashMap<>();
        
            
        for(int i=0;i<strs.length;i++)
        {
            String curr=strs[i];
            //char[] arr=curr.toCharArray();
           // Arrays.sort(arr);
            //String sorted=String.valueOf(arr);
            double value=calculateProduct(curr);
            
            if(!map.containsKey(value))
            {
                map.put(value,new ArrayList<>());
            }
            map.get(value).add(curr);
        }
            
        return new ArrayList<>(map.values());
            
        }
        public double calculateProduct(String s)
        {
            double product=1;
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                product*=primes[c-'a'];
            }
            return product;
        }
    }

