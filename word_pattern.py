class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        mapping_pattern_to_s = {}
        mapping_s_to_pattern = {}

        s = s.split(" ")
        if len(s) != len(pattern):
            return False

        for pattern_val, s_val in zip(pattern, s):
            if pattern_val not in mapping_pattern_to_s and s_val not in mapping_s_to_pattern:
                mapping_pattern_to_s[pattern_val] = s_val
                mapping_s_to_pattern[s_val] = pattern_val
                # print("mapping_pattern_to_s, mapping_s_to_pattern ",mapping_pattern_to_s, mapping_s_to_pattern )

            elif (mapping_pattern_to_s.get(pattern_val) != s_val) or (mapping_s_to_pattern.get(s_val) != pattern_val):

                # print("mapping_pattern_to_s, mapping_s_to_pattern ",mapping_pattern_to_s, mapping_s_to_pattern )
                return False

        return True

    def wordPattern(self, pattern: str, s: str) -> bool:
        
        def transform(ip_list):
            map_ = {}
            result = ""
            for idx, val in enumerate(ip_list):
                if val not in map_:
                    map_[val] = idx
                result = result + str(map_[val])
            return result
                
        return transform(list(pattern)) == transform(s.split(" "))
