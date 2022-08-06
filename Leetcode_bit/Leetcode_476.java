//476
//. Number Complement


class Solution {
    public int findComplement(int num) {
        int ans =0 ;
        int i =0;
        while (num>0){
            if((num & 1)==0){
                ans += Math.pow(2,i);
            }
            num>>=1;
            i++;
        }
        return ans;
        
    }
}