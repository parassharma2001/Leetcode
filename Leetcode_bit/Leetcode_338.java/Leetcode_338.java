//338 counting bits


class Solution {
    public int[] countBits(int n) {
  
       
       int[] sol = new int[n+1];
        for(int i = 0 ; i<=n ; i++){
            int count = 0;
            int y = i;
            
            while(y > 0){
                y -= (y & -y);
                count++;
            
            }
            sol[i] = count;
     
        }
        
        return sol;
    }
}