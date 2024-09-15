import java.util.*;
//This problem is similar to Isomorphic Strings.
//Time Complexity: O(N)
//Space Complexity: O(N)

public class WordPattern {
    
    public static boolean WordPattern(String pattern, String s)
    {
        String[] arr = s.split(" ");
        if(Math.abs(pattern.length()-arr.length)>=1)
        {
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();

        for(int i =0;i<pattern.length();i++)
        {
            char current = pattern.charAt(i);

            if(map.containsKey(current)==false)
            {
                if(map.containsValue(arr[i])==true)
                {
                    return false;
                }
                map.put(current, arr[i]);
            }
            else{
                if(!map.get(current).equals(arr[i]))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        System.out.println(WordPattern("abba", "dog cat cat dog"));
    }
}
