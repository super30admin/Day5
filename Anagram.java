import java.util.*;
public class Anagram {
        public List<List<String>> groupAnagrams(String[] strs)
        {
            if(strs.length==0)
            {
                return new ArrayList<>();
            }
            //HashMap<String, List<String>> map= new HashMap<>();
            HashMap<Double, List<String>> map= new HashMap<>();
            for(int i=0; i<strs.length; i++)
            {
                String s= strs[i];
                //char[] c= s.toCharArray();
                //Arrays.sort(c);
                //String sorted= String.valueOf(c);
                double primeproduct= prime(s);
                if(!map.containsKey(primeproduct))
                {
                    map.put(primeproduct, new ArrayList<>());
                }
                map.get(primeproduct).add(s);
            }
            return new ArrayList<>(map.values());
        }

        private double prime(String s)
        {
            int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
            double result=1;
            for(int i=0;i<s.length();i++)
            {
                char c= s.charAt(i);
                result= result*primes[c-'a'];

            }
            return result;
        }
        public static void main(String[] args)
        {
            Anagram a= new Anagram();
            String[] strs = {"eat","tea","tan","ate","nat","bat"};
            List<List<String>>s= new ArrayList<>();
            s=a.groupAnagrams(strs);
            System.out.println(s);
        }
    }

