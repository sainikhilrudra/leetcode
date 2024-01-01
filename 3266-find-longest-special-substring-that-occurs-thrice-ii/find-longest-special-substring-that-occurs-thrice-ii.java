class Solution {

     static boolean isMidValid(char[] s, int n, int k) {
         for(char ch='a'; ch<='z'; ch++) {
             int i=0, j=0, cnt=0, f=0;
             while(j < n) {
                 if(s[j] == ch) cnt++;
                 if(j-i+1 < k) j++;
                 else {
                     if(cnt == k) f++;
                     if(f >= 3) return true;
                     if(s[i] == ch) cnt--;
                     i++;
                     j++;
                 }
             }
         }
         return false;
     }

    public int maximumLength(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int low = 1, high = n - 2, ans=-1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(isMidValid(ch, n, mid) == true) {
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