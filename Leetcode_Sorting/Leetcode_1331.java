//1331
//rank transform of an array


import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] newArray = arr.clone();
        Arrays.sort(newArray);
        int prev = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        
        for(int i : newArray){
            if(prev!=i){
                count++;
            map.put(i,count);
            prev=i;
            }
        }
        for(int i =0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}