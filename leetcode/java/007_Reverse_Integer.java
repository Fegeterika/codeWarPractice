/* 
7. Reverse Integer / Easy

Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows. 
*/

/* Method 1 */

class Solution {
    public int reverse(int x) {
        
        int result = 0;
        
        while (x != 0) {
            int digit = x % 10;
            int temp = result * 10 + digit;
            
            if (temp / 10 == result) {
                result = temp;   
            } else {
                return 0;
            }
            
            x = x / 10;
        }
        return result;
    }
}

/* Method 2 - Using String Conversion */

class Solution {
    public int reverse(int x) {
        
        boolean neg = x < 0 ? true : false;
        StringBuilder sb = new StringBuilder(Integer.toString(x)).reverse();
        
        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, '-');
        }
        
        // Check if string value is within the range of integer
        try {
            int result = Integer.parseInt(sb.toString());
            return result;
        } catch (Exception e) {
            return 0;
        }
    }
}
