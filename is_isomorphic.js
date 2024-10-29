/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function (s, t) {
  if (s.length != t.length) return false;
  let sourceToTargetMap = new Map();
  let targetToSourceMap = new Map();

  // Iteration 2
  // State
  // StoT = [e = a, g = d]
  // TtoA = [a = e, d = g]

  // g

  for (let index = 0; index < s.length; index++) {
    let charAtS = s.charAt(index); // E
    let charAtT = t.charAt(index); // A

    // Source
    if (sourceToTargetMap.has(charAtS) == true) {
      if (sourceToTargetMap.get(charAtS) !== charAtT) {
        return false;
      }
    } else {
      sourceToTargetMap.set(charAtS, charAtT);
    }

    // Target
    if (targetToSourceMap.has(charAtT) == true) {
      if (targetToSourceMap.get(charAtT) !== charAtS) {
        return false;
      }
    } else {
      targetToSourceMap.set(charAtT, charAtS);
    }
  }
  return true;
};

test("Scenario #1:", () => {
  //            XYZ
  let sInput = "ABC";
  let tInput = "XYZ";
  //            ABC
  expect(isIsomorphic(sInput, tInput)).toStrictEqual(true);
});

test("Scenario #2:", () => {
  //            XYZ
  let sInput = "ABC";
  let tInput = "XYX";
  //            ABC
  expect(isIsomorphic(sInput, tInput)).toStrictEqual(false);
});

test("Scenario #3:", () => {
  //            XYZ
  let sInput = "foo";
  let tInput = "bar";
  //            ABC
  expect(isIsomorphic(sInput, tInput)).toStrictEqual(false);
});

test("Scenario #4:", () => {
  let sInput = "egg";
  let tInput = "add";
  expect(isIsomorphic(sInput, tInput)).toStrictEqual(true);
});
