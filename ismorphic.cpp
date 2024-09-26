#include <bits/stdc++.h>
#include <iostream>
#include <map>
#include <string>

using namespace std;


/* Time Complexity  : O(n)
 * Space Complexity : O(n)
 */
bool isIsomorphic(string s, string t)
{
    map<char, char> sMap;
    map<char, char> tMap;

    if (s.size() != t.size()) {
        return false;
    }
        
    for (int i = 0; i < s.size(); i++) {
        if (sMap.find(s[i]) == sMap.end()) {
            sMap[s[i]] = t[i];
        } else  if (sMap[s[i]] != t[i]) {
            return false;
        }
            
        if (tMap.find(t[i]) == tMap.end()) {
            tMap[t[i]] = s[i];
        } else  if (tMap[t[i]] != s[i]) {
            return false;
        }
    }  

    return true;
}

int main()
{
    cout << "egg and add are ismorphic? " << isIsomorphic("egg", "add") << endl;
    cout << "ate and eat are ismorphic? " << isIsomorphic("ate", "eat") << endl;
    cout << "pass and fail are ismorphic? " << isIsomorphic("pass", "fail") << endl;

    return 0;
}
