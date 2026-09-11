class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] f = new int[256];
        int l = 0, max = 0;

        for (int r = 0; r < s.length(); r++) {
            f[s.charAt(r)]++;
            while (f[s.charAt(r)] > 1) {
                f[s.charAt(l)]--;
                l++;
            }
            if (r - l + 1 > max) {
                max = r - l + 1;
            }
        }
        return max;
    }
}
