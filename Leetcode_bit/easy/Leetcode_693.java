//693
//Binary Number with Alternating Bits


class Solution {
    public boolean hasAlternatingBits(int n) {
    String str = Integer.toBinaryString(n);
        for(int i =0; i<str.length()-1 ; i++ ){
            if(str.charAt(i)==str.charAt(i+1)){
                return false;
               
            }
        }
        return true;
    }
}