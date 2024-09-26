//TC : O(n)
//SC : O(1)

//This works in leetcode

class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sToTMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        char sch, tch;
        for(int i=0; i< s.length(); i++){

            sch = s.charAt(i);
            tch = t.charAt(i);

            if(sToTMap.get(sch)!=null)
            {
                //System.out.println("found ch.. "+ sch);
                if (sToTMap.get(sch) != t.charAt(i) )
                    return false;
            }
            else{
                //if target char in set that means two diff source char mapped to same target.
                if(tSet.contains(tch))
                    return false;

                sToTMap.put(sch, tch);
                tSet.add(tch);

            }

        }

        //if in hashmap key is missing add
        //if in hashmap there is different value for key then return false

        return true;
    }


    public static final void main(String [] args){
        String s= "egg" , t="add";

        System.out.println(isIsomorphic(s,t));

        s= "foo" ; t="bar";
        System.out.println(isIsomorphic(s,t));

        s= "paper" ; t="title";
        System.out.println(isIsomorphic(s,t));

        s= "ab" ; t="cc";
        System.out.println(isIsomorphic(s,t));

    }
}