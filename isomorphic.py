class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping_s_t = {}
        mapping_t_s = {}
        for c1, c2 in zip(s, t):
            # Case 1: No mapping exists in either of the dictionaries
            if (c1 not in mapping_s_t) and (c2 not in mapping_t_s):
                mapping_s_t[c1] = c2
                mapping_t_s[c2] = c1

            # Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
            # it doesn't match in either of the dictionaries or both
            elif mapping_s_t.get(c1) != c2 or mapping_t_s.get(c2) != c1:
                return False
        return True

    def transformString(self, s: str) -> str:
        index_mapping = {}
        new_str = []

        for i, c in enumerate(s):
            if c not in index_mapping:
                index_mapping[c] = i
            # making a string with first occurence.
            new_str.append(str(index_mapping[c]))
        # print("index_mapping, new_str", index_mapping, new_str)

        return " ".join(new_str)

    def isIsomorphicSolution2(self, s: str, t: str) -> bool:
        print(self.transformString(s), "okk", self.transformString(t))
        return self.transformString(s) == self.transformString(t)
