class Solution {

    static int helper(char[] ch, int n) {
        int ans = -1;
        for(int i=0; i<n; i++) {
            for(int j=n-1; j>i; j--) {
                if(ch[i] == ch[j]) {
                    ans = Math.max(ans, j-i-1);
                }
            }
        }
        return ans;
    }

    public int maxLengthBetweenEqualCharacters(String s) {
        return helper(s.toCharArray(), s.length());
    }
}