// The code doesn't pass all tests on Leetcode.

// Will follow up with better version 

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        int len = strs.size();
        int i = 0; int j;
        int sum;
        map<int, int> sum_map;
        map<int, int>::iterator itr;
        
        vector<vector<string>> ret_vect;
        
        int prime_arr[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101, 103};
        
        string temp;
        
        for(i = 0; i < len; i++)
        {
            temp = strs[i];
            
            j = 0;
            sum = 0;
            
            while(temp[j] != '\0')
            {
                sum += (int(temp[j])) * (prime_arr[int(temp[j])-96]);                
                j++;
            }
            
            itr = sum_map.find(sum);
            if(itr == sum_map.end())
            {   
                vector<string> str_vect;
                str_vect.push_back(temp);
                
                ret_vect.push_back(str_vect);
                cout << ret_vect.size() << endl;
                sum_map.insert(pair<int, int>(sum, ret_vect.size()-1));
            }
            else
            {
                ret_vect[itr->second].push_back(temp);
            }
            
        }
        
        return ret_vect;
    }
};