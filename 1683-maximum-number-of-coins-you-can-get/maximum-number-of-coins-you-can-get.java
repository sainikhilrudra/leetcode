class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int coins = 0;
        int p1=0, p2=piles.length-2;
        while(p1 < p2) {
            coins+=piles[p2];
            p1++;
            p2-=2;
        }
        return coins;
    }
}