package com.company;

import java.util.HashMap;

public class IsomorphicStrings {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> charMapper = new HashMap<Character, Character>();

            for(int i=0; i<s.length(); i++){
                Character thisCharInS = s.charAt(i);
                Character thisCharInT = t.charAt(i);
                Character charInMapper = charMapper.get(thisCharInS);

                if(charInMapper!=null){
                    if(charInMapper != thisCharInT){
                        return false;
                    }

                }else{
                    if(charMapper.containsValue(thisCharInT)){
                        return false;

                    }else{
                        charMapper.put(thisCharInS, thisCharInT);
                    }
                }
            }

            return true;
        }
}
