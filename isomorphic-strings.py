# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


map = {}
valuesseen = set()

if len(s) != len(t):
    return False

for i in range(len(s)):
    if s[i] not in map:
        if t[i] in valuesseen:
            return False
        map[s[i]] = t[i]
        valuesseen.add(t[i])
    else:
        if map[s[i]] != t[i]:
            return False

return True