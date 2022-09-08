//leetcode question 4
// median of two sorted array;



class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int c1 = m + n;
        int[] c = new int[m+n];
        double result = 0.0;
        System.arraycopy(nums1, 0, c, 0, m);
        System.arraycopy(nums2, 0, c, m, n);
        Arrays.sort(c);
            if(c1%2==0){
               result =  (c[(c1/2)-1] + c[c1/2])/(2.0);
            }else{
                result =c[(c1)/2];
            }
        return result;
    }
}