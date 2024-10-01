class Solution {
    public int addDigits(int num) {
        // Continue the process until the number becomes a single digit
        while(num>=10){
        int sum = 0;
       while(num>0){
            // to add last digit
           sum += num%10; 
         //  to remove last digit
         num = num/10;
        }
        num = sum;
        }
        return num;
    }
}