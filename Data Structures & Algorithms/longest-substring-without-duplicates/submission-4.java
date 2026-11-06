class Solution {
  public int lengthOfLongestSubstring(String s) {
    int max = 0;
    if (s.length() == 1) {
      return 1;
    }
    if (s.length() == 0) {
      return 0;
    }
    Set<Character> set = new HashSet<>();
    int i = 0;
    for (int j = 0; j < s.length(); j++) {

      while (set.contains(s.charAt(j))) {
        set.remove(s.charAt(i));
        i++;
      }
      set.add(s.charAt(j));
      max = Math.max(max, set.size());
    }

    return max;
  }
}
