import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//tc - o(NKlogK)
//SC- O(N)
public class Anagram1 {
    public static void main(String args[])
    {

    }
    public  List< List<String>> find(String[]strs)
    {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);//to string
            if(!map.containsKey(sorted))
            {
               map.put(sorted, new ArrayList<>());
            }
           map.get(sorted).add(s);
            


        }
        return new ArrayList<>(map.values());

    }
}
