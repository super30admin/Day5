import java.util.*;

//HashMap was used to solve this problem. 
//First the string is sorted, since all the anagrams would have same letters.
//Then it is added into the hashmap
//Time Complexity: O(N^2(Log N)) since there are N strings and we sort each String. Sorting takes N Log N time.
public class GroupAnagrams
{
    public static List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs==null || strs.length==0)
        {
            return new ArrayList<List<String>>();
        }
        
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String inp: strs)
        {
            char[] arr = inp.toCharArray();
            Arrays.sort(arr);

            String temp = arr.toString();

            if(!map.containsKey(temp))
            {
                map.put(inp, new ArrayList<>());
            }
            else{
                
                ArrayList<String> hold = map.get(temp);
                hold.add(inp);
                map.put(temp, hold);
            }
        }

        ArrayList<List<String>> ans = new ArrayList<>();
        
       ans.addAll(map.values());
       return ans;

    }


    public static void main(String args[])
    {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(strs);
        for(int i =0;i<ans.size();i++)
        {
            List<String> temp = ans.get(i);

            for(int j=0;j<temp.size();j++)
            {
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
        }
    }
}