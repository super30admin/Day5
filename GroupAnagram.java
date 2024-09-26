import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagram(String[] strs) {
        HashMap<Long, List<String>> map = new HashMap<>();
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        for(String str: strs)
        {
            long primeProduct = primeProducts(str);
            if(!map.containsKey(primeProduct))
            {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());
    }
    private long primeProducts(String s)
    {
        int[] prime={ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,105};
        long result = 1;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            result = result * prime[c - 'a'];
        }
        return result;
    }
    public static void main(String args[])
    {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagram obj = new GroupAnagram();
        System.out.println(obj.groupAnagram(strs));
    }
}

//time complexity is O(nl)
//space complexity is O(1)
