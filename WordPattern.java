
import java.util.HashMap;
import java.util.Map;

class WordPattern {
    
    public boolean wordPattern(String pattern, String s) {

        Map<Character,String> map = new HashMap<>();

        String[] arr = s.split(" ");


       if(pattern.length()!=arr.length)
        {
            return false;
        }
        else
            if(pattern==null || arr==null)
            {
                return false;
            }


        for(int i=0;i<pattern.length();i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!map.get(pattern.charAt(i)).equals(arr[i]))
                {
                    return false;
                }
                else
                {
                    continue;
                }
            }
            else if(map.containsValue(arr[i]))
            {
                return false;
            }
            else
            {
                map.put(pattern.charAt(i),arr[i]);
            }

        }



       return true; 
    }
} 
