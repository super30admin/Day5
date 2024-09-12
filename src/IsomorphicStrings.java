// Approach:            Approach 1      Approach 2      Approach 3      Approach 4
// Time Complexity:        O(n)           O(n)             O(n)            O(n)
// Space Complexity:       O(1)           O(1)             O(1)            O(n)
// where n is length of given string array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement for brute force approach

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings
{
    public static void main(String[] args) {

        String str1 = "abcdefghijklmnopqrstuvwxyzva" ;
        String str2 = "abcdefghijklmnopqrstuvwxyzck" ;
        Isomorphic i = new Isomorphic() ;
        System.out.println(i.isIsomorphic(str1, str2));
    }
}

class Isomorphic
{
    public boolean isIsomorphic(String s, String t) {


// ****************************** APPROACH 1 ******************************
        Map<Character,Character> hm = new HashMap<>() ;
        Set<Character> set = new HashSet<>() ;

        for(int i = 0; i < s.length(); i++)
        {
            char sChar = s.charAt(i) ;
            char tChar = t.charAt(i) ;

            if(hm.containsKey(sChar))                                           // if character of String s is already key in map
            {
                if(!(hm.get(sChar) == tChar))                                   // if character of String t is different value in map for key
                    return false;
            }
            else                                                                // if character of String s is not key in map
            {
                if(set.contains(tChar))                                         // if character of String t is present in set but no key corresponding in map
                    return false ;
                else                                                            // no key, value in map or no key in set
                {
                    hm.put(sChar, tChar);
                    set.add(tChar);
                }
            }
        }
        return true ;


// ****************************** APPROACH 2 ******************************
//        Map<Character, Character> map1 = new HashMap<>() ;
//        Map<Character, Character> map2 = new HashMap<>() ;
//        for(int i = 0 ; i < s.length() ; i++ )
//        {
//            char sChar = s.charAt(i) ;
//            char tChar = t.charAt(i) ;
//            if(map1.containsKey(sChar))
//            {
//                if(!(map1.get(sChar) == tChar))
//                    return false;
//            }
//            else
//                map1.put(sChar,tChar);
//            if(map2.containsKey(tChar))
//            {
//                if(!(map2.get(t.charAt(i)) == sChar))
//                    return false;
//            }
//            else
//                map2.put(tChar,sChar);
//        }
//        return true;


// ****************************** APPROACH 3 ******************************
//        Map<Character, Character> map = new HashMap<>() ;
//        for(int i = 0 ; i < s.length() ; i++ )
//        {
//            if(map.containsKey(s.charAt(i)))
//            {
//                if(!(map.get(s.charAt(i)) == t.charAt(i)))
//                    return false;
//            }
//            for (Map.Entry<Character, Character> entry : map.entrySet()) {
//                if ((entry.getValue().equals(t.charAt(i))) && (!entry.getKey().equals(s.charAt(i)))) {
//                    return false;
//                }
//            }
//            map.put(s.charAt(i),t.charAt(i));
//        }
//        return true;



// ****************************** APPROACH 4 ******************************
//        return buildString(s).equals(buildString(t));
    }

//    private String buildString(String s)
//    {
//        StringBuilder sb = new StringBuilder();
//
//        HashMap<Character,Integer> map = new HashMap<>();
//
//        for(int i=0; i<s.length(); i++)
//        {
//            if(!map.containsKey(s.charAt(i)))
//                map.put(s.charAt(i),i);
//
//            sb.append(Integer.toString(map.get(s.charAt(i))));
//            sb.append(" ");
//        }
//
//        return sb.toString();
//
//    }

}