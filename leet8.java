public class leet8 {
    public int myAtoi(String s) {
        // Step 1: Handle empty string
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        // Step 2: Trim leading and trailing whitespaces
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        // Step 3: Determine the sign
        int sign = 1;
        int start = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            start++;
        }

        // Step 4: Convert characters to integer
        long result = 0; // Use long to handle overflow
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                break;
            }
            result = result * 10 + (c - '0');

            // Step 5: Check for overflow and return boundary value
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) result * sign;
    }

    public static void main(String[] args) {
        leet8 atoi = new leet8();
        System.out.println(atoi.myAtoi("42")); // Output: 42
        System.out.println(atoi.myAtoi("   -42")); // Output: -42
        System.out.println(atoi.myAtoi("4193 with words")); // Output: 4193
        System.out.println(atoi.myAtoi("words and 987")); // Output: 0
        System.out.println(atoi.myAtoi("-91283472332")); // Output: -2147483648
    }
}
