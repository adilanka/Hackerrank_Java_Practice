class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> substring = new HashSet<>();
        int sol = 0;
        int left = 0;
        for(int right = 0;right<s.length();right++)
        {
            if(!substring.contains(s.charAt(right)))
            {
                substring.add(s.charAt(right));
                sol = Math.max(sol,right-left+1);
            }
            else
            {
                while(s.charAt(left) != s.charAt(right))
                {
                    substring.remove(s.charAt(left));
                    left++;
                }
                substring.remove(s.charAt(left));
                left++;
                substring.add(s.charAt(right));
            }

        }
        return sol;
    }
}
