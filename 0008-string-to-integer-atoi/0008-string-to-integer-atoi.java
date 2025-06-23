class Solution {
    public int myAtoi(String s) {
       int i =  0,n = s.length();
       // skip spaces:
       while(i<n && s.charAt(i)==' '){
        i++;
       } 
       // sign dekh liye:
       int sign = 1;
       if(i<n&&(s.charAt(i)=='+'|| s.charAt(i) == '-')){
        sign = s.charAt(i) == '-'? -1 : 1;
        i++;
       }
      //convert digit to number:
      long result = 0; // long to stop overflow:
      while(i<n&&Character.isDigit(s.charAt(i))){
        int digit = s.charAt(i)-'0';
        result = result*10+digit;

         //Clamp if out of 32-bit range
       if (sign * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
      }
     return (int)(sign * result);
    }
}