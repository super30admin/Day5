def isIsomorphic(s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        # O(len(s)) to build the empty dict and O(len(s)) space used for the sdict and tdict
        sdict = {a:None for a in list(s)}
        tdict = {a:None for a in list(t)}
        # Single Iteration with zipped array. O(len(s))
        for chars,chart in zip(list(s), list(t)):
            if sdict[chars] is not None and sdict[chars] != chart or (tdict[chart] != chars and tdict[chart] is not None):
                return False
            else:
                tdict[chart] = chars
                sdict[chars] = chart
        return True
