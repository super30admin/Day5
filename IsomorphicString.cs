using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class IsomorphicString
    {

        // Time Complexity : O(n) as we are traversing through all charecters of strings
        // Space Complexity: O(1)  only constant space required becuase we are mapping only once each element and ignoring if element is already present
        public bool IsIsomorphic(string s, string t)
        {
            if (s.Length != t.Length)
                return false;

            Dictionary<char, char> sHashMap = new Dictionary<char, char>();
            Dictionary<char, char> tHashMap = new Dictionary<char, char>();

            char[] sCharArray = s.ToCharArray();
            char[] tCharArray = t.ToCharArray();

            for (int i = 0; i < s.Length; i++)
            {
                char schar = sCharArray[i];
                char tchar = tCharArray[i];
                if (!sHashMap.ContainsKey(schar))
                {
                    sHashMap.Add(schar, tchar);
                }
                else if (sHashMap[schar] != tchar)
                {
                    return false;
                }

                if (!tHashMap.ContainsKey(tchar))
                {
                    tHashMap.Add(tchar, schar);

                }
                else if (tHashMap[tchar] != schar)
                {
                    return false;
                }
            }

            return true;
        }

        public bool IsIsomorphic1(string s, string t)
        {
            if (s.Length != t.Length)
                return false;

            Dictionary<char, char> sHashMap = new Dictionary<char, char>();
            HashSet<char> tSet = new HashSet<char>();
            char[] sCharArray = s.ToCharArray();
            char[] tCharArray = t.ToCharArray();

            for (int i = 0; i < s.Length; i++)
            {
                char schar = sCharArray[i];
                char tchar = tCharArray[i];
                if (!sHashMap.ContainsKey(s.ToCharArray()[i]))
                {
                    sHashMap.Add(schar, tchar);
                    if (tSet.Contains(tchar))
                        return false;

                    tSet.Add(tchar);
                }
                else if (sHashMap[schar] != tchar)
                    return false;
            }

            return true;
        }

        /*
         * In this case ascii value of each charecter as index used
         * Initially all the char array will have 0 value set by default
         * algorihm check index of ascii value of charecter - ascii value of {space} so that index will not go beyond 100 e.g. like hashing algorithm.
         */

        public bool IsIsomorphic2(string s, string t)
        {

            if (s.Length != t.Length)
                return false;

            char[] sArray = new char[100];
            char[] tArray = new char[100];
            char[] sCharArray = s.ToCharArray();
            char[] tCharArray = t.ToCharArray();

            for (int i = 0; i < s.Length; i++)
            {
                char schar = sCharArray[i];
                char tchar = tCharArray[i];
                if (sArray[schar - ' '] == 0)
                {
                    sArray[schar - ' '] = tchar;
                }
                else if (sArray[schar - ' '] != tchar)
                {
                    return false;
                }

                if (tArray[tchar - ' '] == 0)
                {
                    tArray[tchar - ' '] = schar;
                }
                else if (tArray[tchar - ' '] != schar)
                {
                    return false;
                }
            }

            return true;
        }

    }
}
