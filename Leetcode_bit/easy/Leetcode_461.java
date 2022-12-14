//461 hamming distance


class Solution {
    public int hammingDistance(int x, int y) {
        int count =0;
        int ans = x^y;
        while(ans > 0){
            ans -= ans & -ans;
            count++;
        }
        return count;
    }
}