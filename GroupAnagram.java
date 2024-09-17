import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach


public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)
            return new ArrayList<>();
        Map<Long,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            //we will get same prime products for anagrams
            long primeProduct=getPrimeProducts(s);
           
            map.putIfAbsent(primeProduct, new ArrayList<>());
            map.get(primeProduct).add(s);
        }
        
        return new ArrayList<>(map.values());
    }

    public long getPrimeProducts(String str)
    {
        long temp=1;
        int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,103};
        for(int i=0;i<str.length();i++)
        {
            temp*=primes[str.charAt(i)-'a'];

        }
        return temp;

    }

    public static void main(String[] args)
    {
        GroupAnagram obj=new GroupAnagram();
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.print(obj.groupAnagrams(strs));
    }
}