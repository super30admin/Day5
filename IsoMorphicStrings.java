//Time Complexity: O(1)
//Space Complexity:O(1)

//USing Arrays is faster than HashMaps, as HashMaps use Arrays underlying

public boolean isIsomorphic (String s, String t) {

//The size is 256 = ASCII values

//Take Example: "ab" "aa" False;

        int[] m1 = new int[256];
        int[] m2 = new int[256];
        
        int n = s.length();
        for (int i = 0; i < n; i++) {
        
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;    //updating ASCII values of both equally
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
