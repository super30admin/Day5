class IsomorphicStrings {
		 /*
      * Three implementations using 2 HashMaps, a HashMap and a HashSet
      * and 
      */

    public boolean isIsomorphic(String s, String t) {
        
        /*
         * Time Complexity: O(n) to iterate over the string
         * Space ComplexityL: O(1) As both HashMap will have at most 26 or 52 characters (alphabets)
         *
         */
        
        if (s.length() != t.length()) return false;
        
        // 2 HashMap Solution
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for (int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (sMap.containsKey(sChar)) {
                if (!sMap.get(sChar).equals(tChar)) {
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }
        }
        
        for (int i=0; i<t.length(); i++) {
            char tChar = t.charAt(i);
            char sChar = s.charAt(i);
            
            if (tMap.containsKey(tChar)) {
                if (!tMap.get(tChar).equals(sChar)) {
                    return false;
                }
            } else {
                tMap.put(tChar, sChar);
            }
        }
        
        return true;
    }

		public boolean isIsomorphicHH(String s, String t) {
		    
			  /*
         * Time Complexity: O(n) to iterate over the string
         * Space ComplexityL: O(1) As both HashMap and HashSet will have at most 26 or 52 characters (alphabets)
         *
         */
        
        if (s.length() != t.length()) return false;
        
        // HashMap & HashSet Solution
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        for (int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (!map.containsKey(sChar)) {
                map.put(sChar, tChar);
                if (set.contains(tChar)) {
                    return false;
                }
                set.add(tChar);
            } else {
                if (map.get(sChar) != tChar) {
                    return false;
                }
            }
        }                
        
        return true;
		}

		public boolean isIsomorphicCharacterArrays(String s, String t) {
				
				char[] sMap = new char[100];
        char[] tMap = new char[100];
        
        for (int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (sMap[sChar - ' '] == 0) {
                sMap[sChar - ' '] = tChar;
            } else {
                if (sMap[sChar - ' '] != tChar) {
                    return false;
                }
            }
            
            if (tMap[tChar - ' '] == 0) {
                tMap[tChar - ' '] = sChar;
            } else {
                if (tMap[tChar - ' '] != sChar) {
                    return false;
                }
            }
        }
        
        return true;
		}
}
