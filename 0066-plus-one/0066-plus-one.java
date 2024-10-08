class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
       // for the case digit = {9} or {0, 0}
        int[] newNo = new int[n+1];
        newNo[0] = 1;

        return newNo;
    }
}