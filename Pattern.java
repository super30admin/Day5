import java.util.*;
public class Pattern {
        public boolean wordPattern(String pattern, String s)
        {
            String[] str= s.split(" ");
            if(pattern.length() != str.length)
            {
                return false;
            }
            HashMap<Character, String> map= new HashMap<>();
            HashSet<String> set= new HashSet<>();
            for(int i=0;i<pattern.length(); i++)
            {
                char c= pattern.charAt(i);
                String st= str[i];
                if(map.containsKey(c))
                {
                    if(!map.get(c).equals(st))
                    {
                        return false;
                    }
                }
                else
                {
                    map.put(c,st);
                    if(set.contains(st))
                    {
                        return false;
                    }
                    set.add(st);
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Pattern p= new Pattern();
            System.out.println(p.wordPattern("abba", "dog cat cat dog"));
        }
    }

