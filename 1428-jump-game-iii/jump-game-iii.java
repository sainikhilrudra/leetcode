class Solution {

    static Set<Integer> set = new HashSet<>();
    static boolean helper(int[] arr, int idx) {
        if(idx >= arr.length || idx < 0 || set.contains(idx)) return false;
        if(arr[idx] == 0) return true;
        set.add(idx);
        boolean left = helper(arr, idx+arr[idx]);
        boolean right = helper(arr, idx-arr[idx]);
        set.remove(idx);
        return left || right;
    }

    public boolean canReach(int[] arr, int start) {
        set.clear();
        return helper(arr, start);
    }
}