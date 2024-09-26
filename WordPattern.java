// TC : O(n)
// SC : O(1)
//Works in leetcode
class WordPattern {
    public static boolean hasWordPattern(String p, String s) {
        HashMap<Character, String> sToTMap = new HashMap<>();

        String [] arrOfS = s.split(" ");
        char pch;
        String sStr;

        for(int i=0; i< p.length(); i++){

            pch = p.charAt(i);
            sStr = arrOfS[i];

            if(sToTMap.get(pch)!=null)
            {
                // System.out.println("found str.. "+ pch + " "+ sStr);
                //if in hashmap there is different value for key then return false
                if (! sToTMap.get(pch).equals(sStr))
                    return false;
            }
            else{
                //if in hashmap key is missing add
                //  System.out.println("adding... ch, Str::  "+ pch + " " + sStr);
                sToTMap.put(pch, sStr);

            }

        }


        return true;
    }


    public static final void main(String [] args){
        String pattern= "abba" , s="dog cat cat dog";

        System.out.println(hasWordPattern(pattern,s));

        pattern= "abba" ; s="dog cat cat fish";
        System.out.println(hasWordPattern(pattern,s));

        pattern= "aaaa" ; s="dog cat cat dog";
        System.out.println(hasWordPattern(pattern,s));

    }
}