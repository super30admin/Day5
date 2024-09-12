// Time Complexity : O(nk)  n=number of strings in array k=length of the string
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No



import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] primes=new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Map<Double, ArrayList<String>> map= new HashMap<>();
        List<List<String>> sol=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
        	double primep=1;
        	char[] ltrs=strs[i].toCharArray();
        	for(int j=0;j<ltrs.length;j++)
        	{
        		primep=primep*primes[ltrs[j]-'a'];
        	}
        	if(map.containsKey(primep))
        	{
        		map.get(primep).add(strs[i]);
        	}
        	else
        	{
        		ArrayList<String> temp=new ArrayList<String>();
        		temp.add(strs[i]);
        		map.put(primep,temp);
        	}	
        }
        Iterator temp= map.values().iterator();
        
        while(temp.hasNext())
        {
        	sol.add((List<String>) temp.next());
        }
        
        	return sol;
        
        
    }
}