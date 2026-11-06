class Solution {
  public int lengthOfLongestSubstring(String s) {
    int max = Integer.MIN_VALUE;
    if (s.length() == 1) {
      return 1;
    }
    if (s.length() == 0) {
      return 0;
    }
    for (int i = 0; i < s.length() - 1; i++) {
      int count = 1;
      Set<Character> set = new HashSet<>();
      set.add(s.charAt(i));
      for (int j = i + 1; j < s.length(); j++) {
        if (!set.contains(s.charAt(j))) {
          set.add(s.charAt(j));
        } else {
          break;
        }
        count++;
      }
      max = Math.max(max, count);
    }
    return max;
  }
}
