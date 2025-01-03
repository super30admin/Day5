############## Check if two strings are isomorphic  ######

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Using two hashmaps store the mapping from s to t and t to s. If there is a conflict
# in the mapping return False


def isIsomorpic(s,t):
    if len(s)!=len(t):
            return False
    mapper_s = {}
    mapper_t = {}
    for i in range(len(s)):
        if s[i] not in mapper_s:
            mapper_s[s[i]] = t[i]
        else:
            if t[i] != mapper_s[s[i]]:
                return False
        if t[i] not in mapper_t:
            mapper_t[t[i]] = s[i]
        else:
            if s[i] != mapper_t[t[i]]:
                return False
    return True
