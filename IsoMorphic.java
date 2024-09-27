import java.util.*;

public class IsoMorphic {

    public static boolean isIsomorphic(String s, String t) {

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Map<Character, Character> map= new HashMap<>();
        Map<Character, Character> map2= new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<c2.length;i++)
        {
            if(!map2.containsKey(c2[i]))
                map2.put(c2[i],c1[i]);
        }


        for(int i=0; i< c1.length; i++)
        {
            if( !map.containsKey(c1[i]))
            {
                map.put(c1[i],c2[i]);

                if(map2.get(c2[i]) != c1[i])
                    return false;

                else
                    sb.append(c2[i]);

            }

            else if(map.containsKey(c1[i]))
                sb.append(map.get(c1[i]));


        }

        return (sb.toString().equals(t));

    }

    public static void main(String[] args) {
        String s ="foo";
        String t=  "adc";

        boolean isIsoMorphic = isIsomorphic(s,t);

        System.out.println(isIsoMorphic);

    }
}
