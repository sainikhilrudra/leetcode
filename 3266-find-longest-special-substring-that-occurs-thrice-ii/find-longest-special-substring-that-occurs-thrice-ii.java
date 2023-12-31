class Solution {
    
    static boolean isMidValid(char[] ch, int n, int k) {
        int i=0, j=0, unique = 0;
        int cnt[] = new int[26];
        int f[] = new int[26];
        while(j < n) {
            cnt[ch[j] - 'a']++;
            if(cnt[ch[j] - 'a'] == 1) unique++;
            if(j-i+1 == k) {
                if(unique == 1) {
                    f[ch[j] - 'a']++;
                    if(f[ch[j] - 'a'] >= 3) {
                        return true;
                    }
                }
            cnt[ch[i] - 'a']--;
            if(cnt[ch[i] - 'a'] == 0) unique--; 
            i++;
            }
            j++;
        }
        return false;
    }
    
    public int maximumLength(String s) {
        
        char[] ch = s.toCharArray();
        int n = ch.length;
        int ans = -1;
        int low = 1, high = n-2;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(isMidValid(ch, n, mid)) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}